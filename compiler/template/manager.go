package template

import (
	"fmt"
	"github.com/thanhhuy5902/Flux_lang/shared"
	"os"
	"os/exec"
	"runtime"
)

type TemplateManager struct {
	mainFile     *OutputFile
	shellFile    *OutputFile
	outputILPath string
	outputPath   string
}

func NewTemplateManager(sourceCode string, outputILPath string, outputPath string) *TemplateManager {
	mainFile := NewOutputFile(sourceCode, "main.c", outputILPath)
	shellFile := NewOutputFile(fmt.Sprintf(`
	#bin/bash
	g++ -o %s %s/main.c
	`, outputPath, outputILPath), "build.sh", outputILPath)
	return &TemplateManager{
		mainFile:     mainFile,
		shellFile:    shellFile,
		outputILPath: outputILPath,
		outputPath:   outputPath,
	}
}

func (t *TemplateManager) Generate(params *shared.CompilationParams) error {
	err := t.mainFile.Generate()
	if err != nil {
		return err
	}
	err = t.shellFile.Generate()
	if err != nil {
		return err
	}
	var execErr error
	// execute shell file
	if runtime.GOOS != "windows" {
		print("Executing shell file: " + t.shellFile.Dir + "/" + t.shellFile.FileName + "\n")
		cmd := exec.Command("sh", t.shellFile.Dir+"/"+t.shellFile.FileName)
		execErr = cmd.Run()
	}

	if execErr != nil {
		fmt.Printf("Error: %v\n", execErr)
	}

	if params.DisableIL {
		// remove intermediate files
		err := os.RemoveAll(t.outputILPath)
		if err != nil {
			return err
		}
	}

	return execErr
}
