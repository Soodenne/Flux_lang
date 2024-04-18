package codeobjects

import (
	"github.com/thanhhuy5902/Flux_lang/exception"
)

type CodeObject interface {
	Generate(ctx *GenerateContext) string
	Execute(ctx *ExecutionContext) *exception.BaseException
	GetLine() int
	GetStartPos() int
	GetEndPos() int
}

type BaseStatement struct {
	Line     int
	StartPos int
	EndPos   int
}

func (b BaseStatement) Generate(ctx *GenerateContext) string {
	return ""
}

func (b BaseStatement) Execute(ctx *ExecutionContext) *exception.BaseException {
	return nil
}

func (b BaseStatement) GetLine() int {
	return b.Line
}

func (b BaseStatement) GetStartPos() int {
	return b.StartPos
}

func (b BaseStatement) GetEndPos() int {
	return b.EndPos
}
