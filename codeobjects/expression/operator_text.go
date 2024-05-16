package expression

import (
	"github.com/thanhhuy5902/Flux_lang/codeobjects"
	"github.com/thanhhuy5902/Flux_lang/exception"
)

type OperatorText interface {
	SetLeftTextExpr(leftExpr *TextExpression)
	SetRightTextExpr(rightExpr *TextExpression)
	GetRightTextExpr() *TextExpression
	GetLeftTextExpr() *TextExpression
	Generate(ctx *codeobjects.GenerateContext) string
	Execute(ctx *codeobjects.ExecutionContext) *exception.BaseException
}
