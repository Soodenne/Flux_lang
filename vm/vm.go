package vm

import (
	"context"
	"github.com/thanhhuy5902/Flux_lang/codeobjects"
	"github.com/thanhhuy5902/Flux_lang/core"
	fluxIO "github.com/thanhhuy5902/Flux_lang/io"
	fluxParser "github.com/thanhhuy5902/Flux_lang/parser"
	"github.com/thanhhuy5902/Flux_lang/shared"
	"os"
	"time"
)

type FluxVirtualMachine struct {
	parser   *fluxParser.FluxProgramParser
	varTable *core.VarTable
}

func NewFluxVirtualMachine() *FluxVirtualMachine {
	return &FluxVirtualMachine{}
}

func (f *FluxVirtualMachine) Execute(params *shared.ExecutionParams) shared.ExecutionResult {
	// create error collector
	errorCollector := fluxIO.NewBaseErrorCollector()

	elapsedTime := time.Now().UnixMilli()
	// read file at params.EntryPoint
	// get absolute path of entry point from relative path
	absPath, err := os.Getwd()
	if err != nil {
		elapsedTime = time.Now().UnixMilli() - elapsedTime
		return shared.ExecutionResult{
			ErrorCollector: errorCollector,
			ElapsedTime:    elapsedTime,
		}
	}
	mainFileData := ""
	if params.EntryPoint != "" {
		params.EntryPoint = absPath + "/" + params.EntryPoint
		// read file

		mainFileBytes, err := os.ReadFile(params.EntryPoint)
		if err != nil {
			elapsedTime = time.Now().UnixMilli() - elapsedTime
			return shared.ExecutionResult{
				ErrorCollector: errorCollector,
				ElapsedTime:    elapsedTime,
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

	varTable := core.NewVarTable()

	program := fluxParser.Parse(mainFileData, errorCollector, logger).GetProgram()

	executionCtx := codeobjects.NewExecutionContext(context.TODO(), varTable)

	except := program.Execute(executionCtx)

	f.varTable = varTable
	// return result
	elapsedTime = time.Now().UnixMilli() - elapsedTime

	return shared.ExecutionResult{
		ErrorCollector:   errorCollector,
		ElapsedTime:      elapsedTime,
		RuntimeException: except,
	}
}

func (f *FluxVirtualMachine) GetVarTable() *core.VarTable {
	return f.varTable
}
