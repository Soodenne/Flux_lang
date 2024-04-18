package main

import (
	"fmt"
	"github.com/thanhhuy5902/Flux_lang/compiler"
	"github.com/thanhhuy5902/Flux_lang/shared"
	"github.com/urfave/cli/v2"
	"log"
	"os"
)

func main() {
	compl := compiler.NewFluxCompiler()
	app := &cli.App{
		Name:  "fluxc",
		Usage: "Flux Compiler",
		Action: func(*cli.Context) error {
			fmt.Println("A flexible programming language for Web Development")
			return nil
		},
		Commands: []*cli.Command{
			{
				Name:    "build",
				Aliases: []string{"b"},
				Usage:   "Build a Flux project",
				Action: func(c *cli.Context) error {
					// get the project name -i flag
					entryPoint := c.String("i")
					verbose := c.Bool("v")
					outputPath := c.String("o")
					enableIL := c.Bool("il")
					ilPath := c.String("ilpath")
					fmt.Printf("Building %s\n", entryPoint)
					// execute the virtual machine
					result := compl.Compile(&shared.CompilationParams{EntryPoint: entryPoint, Verbose: verbose, Output: outputPath, DisableIL: !enableIL, ILPath: ilPath})
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
					&cli.StringFlag{
						Name:  "o",
						Value: "",
						Usage: "output file",
					},
					&cli.BoolFlag{
						Name:  "il",
						Value: false,
						Usage: "enable intermediate language",
					},
					&cli.StringFlag{
						Name:  "ilpath",
						Value: "",
						Usage: "intermediate language output file",
					},
				},
			},
		},
	}

	if err := app.Run(os.Args); err != nil {
		log.Fatal(err)
	}
}
