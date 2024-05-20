package codeobjects

import (
	"context"
	"github.com/thanhhuy5902/Flux_lang/common"
	"github.com/thanhhuy5902/Flux_lang/core"
)

type Arg struct {
	RawValue string
	Type     common.FluxType
}

type ExecutionContext struct {
	ctx             context.Context
	NumericValue    float64
	TextValue       string
	BoolValue       bool
	VarTable        *core.VarTable
	ReturnValueRaw  string
	ReturnValueType common.FluxType
	Args            []*Arg
}

func (e ExecutionContext) Clone() *ExecutionContext {
	return &ExecutionContext{
		ctx:          e.ctx,
		NumericValue: e.NumericValue,
		TextValue:    e.TextValue,
		VarTable:     e.VarTable,
	}
}

func NewExecutionContext(ctx context.Context, varTable *core.VarTable) *ExecutionContext {
	return &ExecutionContext{
		ctx:          ctx,
		NumericValue: 0,
		TextValue:    "",
		VarTable:     varTable,
	}
}

type GenerateContext struct {
	Ctx     context.Context
	CodeFmt string
	Args    []interface{}
}

func (e GenerateContext) Clone() *GenerateContext {
	return &GenerateContext{
		Ctx:     e.Ctx,
		CodeFmt: e.CodeFmt,
		Args:    e.Args,
	}
}

func NewGenerateContext(ctx context.Context) *GenerateContext {
	return &GenerateContext{
		Ctx: ctx,
	}
}
