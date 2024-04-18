package compiler

import (
	"context"
	"github.com/thanhhuy5902/Flux_lang/codeobjects"
	"github.com/thanhhuy5902/Flux_lang/compiler/template"
	"github.com/thanhhuy5902/Flux_lang/exception"
	fluxIO "github.com/thanhhuy5902/Flux_lang/io"
	fluxParser "github.com/thanhhuy5902/Flux_lang/parser"
	"github.com/thanhhuy5902/Flux_lang/shared"
	"os"
	"runtime"
)

type FluxCompiler struct {
}

func NewFluxCompiler() *FluxCompiler {
	return &FluxCompiler{}
}

func (f *FluxCompiler) Compile(params *shared.CompilationParams) shared.CompilationResult {
	// create error collector
	errorCollector := fluxIO.NewBaseErrorCollector()

	// read file at params.EntryPoint
	// get absolute path of entry point from relative path
	absPath, err := os.Getwd()
	if err != nil {
		return shared.CompilationResult{
			ErrorCollector: errorCollector,
		}
	}
	mainFileData := ""
	if params.EntryPoint != "" {
		params.EntryPoint = absPath + "/" + params.EntryPoint
		// read file

		mainFileBytes, err := os.ReadFile(params.EntryPoint)
		if err != nil {
			return shared.CompilationResult{
				ErrorCollector: errorCollector,
			}
		}
		mainFileData = string(mainFileBytes)
	} else {
		mainFileData = params.SourceCode
	}
	// create logger
	var logger fluxIO.Logger = fluxIO.NewEmptyLogger()
	if params.Verbose {
		logger = fluxIO.NewBaseLogger()
	}

	program := fluxParser.Parse(mainFileData, errorCollector, logger).GetProgram()

	if len(errorCollector.GetErrors()) != 0 {
		return shared.CompilationResult{
			ErrorCollector: errorCollector,
		}
	}

	generateCtx := codeobjects.NewGenerateContext(context.TODO())

	destinationCode := program.Generate(generateCtx)

	if params.ILPath == "" {
		params.ILPath = params.EntryPoint + ".il"
	}

	if params.Output == "" {
		if runtime.GOOS != "windows" {
			params.Output = "example.bin"
		} else {
			params.Output = "example.exe"
		}
	}

	templateManager := template.NewTemplateManager(destinationCode, params.ILPath, params.Output)
	err = templateManager.Generate(params)

	if err != nil {
		errorCollector.CollectError(&exception.BaseException{
			MessageFmt: "Compiling error: %s",
			Args:       []interface{}{err.Error()},
		})
	}

	// return result
	return shared.CompilationResult{
		ErrorCollector: errorCollector,
	}
}
