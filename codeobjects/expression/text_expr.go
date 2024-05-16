package expression

import (
	"fmt"
	codeobjects2 "github.com/thanhhuy5902/Flux_lang/codeobjects"
	"github.com/thanhhuy5902/Flux_lang/exception"
)

type TextExpression struct {
	*codeobjects2.BaseStatement
	LeftTextExpr  *TextExpression
	Op            OperatorText
	RightTextExpr *TextExpression
	Value         string
	GetVar        *GetVar
}

func (t TextExpression) Generate(ctx *codeobjects2.GenerateContext) string {

	if t.GetVar != nil {
		return t.GetVar.Generate(ctx)
	}

	if t.LeftTextExpr == nil && t.RightTextExpr == nil {
		return fmt.Sprintf("%v", t.Value)
	}

	return t.Op.Generate(ctx)
}

func (t TextExpression) Execute(ctx *codeobjects2.ExecutionContext) *exception.BaseException {

	if t.GetVar != nil {
		return t.GetVar.Execute(ctx)
	}

	if t.LeftTextExpr == nil && t.RightTextExpr == nil {
		ctx.TextValue = t.Value

		return nil

	}

	t.Op.SetLeftTextExpr(t.LeftTextExpr)
	t.Op.SetRightTextExpr(t.RightTextExpr)
	return t.Op.Execute(ctx)
}

func NewTextExpression(line int, startPos int, endPos int, leftTextExpr *TextExpression, operator OperatorText, rightTextExpr *TextExpression, value string) *TextExpression {
	return &TextExpression{BaseStatement: &codeobjects2.BaseStatement{Line: line, StartPos: startPos, EndPos: endPos}, LeftTextExpr: leftTextExpr, Op: operator, RightTextExpr: rightTextExpr, Value: value}
}
