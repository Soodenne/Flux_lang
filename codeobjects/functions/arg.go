package functions

import (
	"fmt"
	"github.com/thanhhuy5902/Flux_lang/codeobjects"
	"github.com/thanhhuy5902/Flux_lang/codeobjects/expression"
	"github.com/thanhhuy5902/Flux_lang/common"
	"github.com/thanhhuy5902/Flux_lang/exception"
)

type Args struct {
	*codeobjects.BaseStatement
	Exprs []*expression.MathExpression
}

func (a Args) Generate(ctx *codeobjects.GenerateContext) string {
	// args should be generated as a comma separated list
	args := ""
	for i, expr := range a.Exprs {
		if i > 0 {
			args += ", "
		}
		args += expr.Generate(ctx)
	}
	return args
}

func (a Args) Execute(ctx *codeobjects.ExecutionContext) *exception.BaseException {
	ctx.Args = []*codeobjects.Arg{}
	for _, expr := range a.Exprs {
		// check if the expression is a math expression

		err := expr.Execute(ctx)
		if err != nil {
			return err
		}
		ctx.Args = append(ctx.Args, &codeobjects.Arg{
			RawValue: fmt.Sprintf("%v", ctx.NumericValue),
			Type:     common.FluxTypeNumber,
		})
		// process on other types
	}
	return nil
}
