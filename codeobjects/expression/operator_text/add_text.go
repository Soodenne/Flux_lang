package operator_text

import (
	codeobjects2 "github.com/thanhhuy5902/Flux_lang/codeobjects"
	"github.com/thanhhuy5902/Flux_lang/codeobjects/expression"
	"github.com/thanhhuy5902/Flux_lang/exception"
)

type AddText struct {
	*codeobjects2.BaseStatement
	LeftTextExpr  *expression.TextExpression
	RightTextExpr *expression.TextExpression
}

func (a *AddText) SetLeftTextExpr(leftExpr *expression.TextExpression) {
	a.LeftTextExpr = leftExpr

}

func (a *AddText) SetRightTextExpr(rightExpr *expression.TextExpression) {
	a.RightTextExpr = rightExpr
}

func (a *AddText) GetRightTextExpr() *expression.TextExpression {
	return a.RightTextExpr

}

func (a *AddText) GetLeftTextExpr() *expression.TextExpression {
	return a.LeftTextExpr
}

func (a *AddText) Generate(ctx *codeobjects2.GenerateContext) string {
	return a.LeftTextExpr.Generate(ctx) + " + " + a.RightTextExpr.Generate(ctx)
}

func (a *AddText) Execute(ctx *codeobjects2.ExecutionContext) *exception.BaseException {

	leftCtx := ctx.Clone()
	rightCtx := ctx.Clone()
	if a.LeftTextExpr != nil {
		err := a.LeftTextExpr.Execute(leftCtx)
		if err != nil {
			return err
		}
	} else {
		leftCtx.TextValue = ""
	}
	if a.RightTextExpr != nil {
		err := a.RightTextExpr.Execute(rightCtx)
		if err != nil {
			return err
		}
	} else {
		rightCtx.TextValue = ""
	}
	ctx.TextValue = leftCtx.TextValue + rightCtx.TextValue
	return nil
}

func NewAddText(line int, startPos int, endPos int, leftTextExpr *expression.TextExpression, rightTextExpr *expression.TextExpression) *AddText {
	return &AddText{BaseStatement: &codeobjects2.BaseStatement{Line: line, StartPos: startPos, EndPos: endPos}, LeftTextExpr: leftTextExpr, RightTextExpr: rightTextExpr}
}
