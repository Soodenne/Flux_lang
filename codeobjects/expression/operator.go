package expression

import (
	"github.com/thanhhuy5902/Flux_lang/codeobjects"
	"github.com/thanhhuy5902/Flux_lang/exception"
)

type Operator interface {
	SetLeftExpr(leftExpr *NumericExpression)
	SetRightExpr(rightExpr *NumericExpression)
	GetLeftExpr() *NumericExpression
	GetRightExpr() *NumericExpression
	Generate(ctx *codeobjects.GenerateContext) string
	Execute(ctx *codeobjects.ExecutionContext) *exception.BaseException
}
