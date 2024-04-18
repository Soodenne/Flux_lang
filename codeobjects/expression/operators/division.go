package operators

import (
	"github.com/thanhhuy5902/Flux_lang/codeobjects"
	"github.com/thanhhuy5902/Flux_lang/codeobjects/expression"
	"github.com/thanhhuy5902/Flux_lang/exception"
)

type Division struct {
	*codeobjects.BaseStatement
	Left  *expression.NumericExpression
	Right *expression.NumericExpression
}

func (d *Division) SetLeftExpr(leftExpr *expression.NumericExpression) {
	d.Left = leftExpr
}

func (d *Division) SetRightExpr(rightExpr *expression.NumericExpression) {
	d.Right = rightExpr
}

func (d *Division) GetLeftExpr() *expression.NumericExpression {
	return d.Left
}

func (d *Division) GetRightExpr() *expression.NumericExpression {
	return d.Right
}

func (d *Division) Generate(ctx *codeobjects.GenerateContext) string {
	return d.Left.Generate(ctx) + " / " + d.Right.Generate(ctx)
}

func (d *Division) Execute(ctx *codeobjects.ExecutionContext) *exception.BaseException {
	leftCtx := ctx.Clone()
	rightCtx := ctx.Clone()
	if d.Left != nil {
		err := d.Left.Execute(leftCtx)
		if err != nil {
			return err
		}
	} else {
		leftCtx.NumericValue = 0
	}
	if d.Right != nil {
		err := d.Right.Execute(rightCtx)
		if err != nil {
			return err
		}
	} else {
		rightCtx.NumericValue = 0
	}
	if rightCtx.NumericValue == 0 {
		return &exception.BaseException{MessageFmt: "Division by zero", Line: d.Line}
	}
	ctx.NumericValue = leftCtx.NumericValue / rightCtx.NumericValue
	return nil
}

func NewDivision(line int, startPos int, endPos int, left *expression.NumericExpression, right *expression.NumericExpression) *Division {
	return &Division{BaseStatement: &codeobjects.BaseStatement{Line: line, StartPos: startPos, EndPos: endPos}, Left: left, Right: right}
}
