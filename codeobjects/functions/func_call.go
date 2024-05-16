package functions

import (
	"fmt"
	"github.com/thanhhuy5902/Flux_lang/codeobjects"
	"github.com/thanhhuy5902/Flux_lang/exception"
)

type FunctionCall struct {
	*codeobjects.BaseStatement
	Name string
	Args *Args
}

func NewFunctionCall(baseStatement *codeobjects.BaseStatement, name string, args *Args) *FunctionCall {
	// declare a var to console log

	return &FunctionCall{BaseStatement: baseStatement, Name: name, Args: args}
}

func (f FunctionCall) Generate(ctx *codeobjects.GenerateContext) string {
	if f.Name == "out" {
		return NewOut(f.Args).Generate(ctx)
	}
	return fmt.Sprintf("%v(%v)", f.Name, f.Args.Generate(ctx))
}

func (f FunctionCall) Execute(ctx *codeobjects.ExecutionContext) *exception.BaseException {
	if f.Name == "out" {
		return NewOut(f.Args).Execute(ctx)
	}
	return nil
}
