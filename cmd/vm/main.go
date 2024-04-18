package main

import (
	"fmt"
	"github.com/thanhhuy5902/Flux_lang/shared"
	"github.com/thanhhuy5902/Flux_lang/vm"
	"github.com/urfave/cli/v2"
	"log"
	"os"
)

func main() {
	virtualMachine := vm.NewFluxVirtualMachine()
	app := &cli.App{
		Name:  "flux",
		Usage: "Flux Virtual Machine",
		Action: func(*cli.Context) error {
			fmt.Println("A flexible programming language for Web Development")
			return nil
		},
		Commands: []*cli.Command{
			{
				Name:    "run",
				Aliases: []string{"r"},
				Usage:   "Run a Flux project",
				Action: func(c *cli.Context) error {
					// get the project name -i flag
					entryPoint := c.String("i")
					verbose := c.Bool("v")
					fmt.Printf("running %s\n", entryPoint)
					// execute the virtual machine
					result := virtualMachine.Execute(&shared.ExecutionParams{EntryPoint: entryPoint, Verbose: verbose})
					fmt.Printf("Execution completed in %dms\n", result.ElapsedTime)
					// check if there are any errors
					if len(result.ErrorCollector.GetErrors()) != 0 {
						fmt.Println("\u001B[31m 8=D Compile with errors! \u001B[0m")
						for _, err := range result.ErrorCollector.GetErrors() {
							// print line number: position and error message
							fmt.Printf("\u001B[31m %d: %d->%d\u001B[0m", err.Line, err.StartPos, err.EndPos)
							fmt.Printf("\u001B[31m "+err.MessageFmt+"\u001B[0m\n", err.Args...)
						}
						return nil
					} else if len(result.ErrorCollector.GetWarnings()) != 0 {
						fmt.Println("\u001B[33m 8=D Compile with warnings! \u001B[0m")
						for _, warn := range result.ErrorCollector.GetWarnings() {
							// print line number: position and error message
							fmt.Printf("\u001B[33m %d: %d->%d\u001B[0m", warn.Line, warn.StartPos, warn.EndPos)
							fmt.Printf("\u001B[33m "+warn.MessageFmt+"\u001B[0m\n", warn.Args...)
						}
					} else {
						fmt.Println("\u001B[34m 8=D Compile with no errors! \u001B[0m")
					}
					if result.RuntimeException != nil {
						fmt.Println("\u001B[31m 8=D Runtime Exception! \u001B[0m")
						fmt.Printf("\u001B[31m "+result.RuntimeException.MessageFmt+"\u001B[0m\n", result.RuntimeException.Args...)
					} else {
						fmt.Println("\u001B[34m 8=D Execution completed successfully! \u001B[0m")
					}
					return nil
				},
				Flags: []cli.Flag{
					&cli.StringFlag{
						Name:  "i",
						Value: "main.flux",
						Usage: "entry point file",
					},
					&cli.BoolFlag{
						Name:  "v",
						Value: false,
						Usage: "verbose",
					},
				},
			},
		},
	}

	if err := app.Run(os.Args); err != nil {
		log.Fatal(err)
	}
}
