package codeobjects

import (
	"fmt"
	"github.com/thanhhuy5902/Flux_lang/exception"
)

type Program struct {
	*BaseStatement
	Statements []CodeObject
	Libraries  []*Program
}

func (p Program) Generate(ctx *GenerateContext) string {
	mainBody := ""
	for _, statement := range p.Statements {
		mainBody += statement.Generate(ctx) + "\n"
	}
	return fmt.Sprintf(`
#include <iostream>
#include <string>
#include <vector>

int main() {
%v
return 0;
}
`, mainBody)
}

func (p Program) Execute(ctx *ExecutionContext) *exception.BaseException {
	for _, statement := range p.Statements {
		err := statement.Execute(ctx)
		if err != nil {
			return err
		}
	}
	return nil
}

func (p Program) GetLine() int {
	return 0
}

func (p Program) GetStartPos() int {
	return 0
}

func (p Program) GetEndPos() int {
	return 0
}

func NewProgram() *Program {
	return &Program{
		Statements: make([]CodeObject, 0),
	}
}
