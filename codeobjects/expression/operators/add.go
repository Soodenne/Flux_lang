package operators

import (
	codeobjects2 "github.com/thanhhuy5902/Flux_lang/codeobjects"
	"github.com/thanhhuy5902/Flux_lang/codeobjects/expression"
	"github.com/thanhhuy5902/Flux_lang/exception"
)

type Add struct {
	*codeobjects2.BaseStatement
	Left      *expression.NumericExpression
	Right     *expression.NumericExpression

}

func (a *Add) SetLeftExpr(leftExpr *expression.NumericExpression) {
	a.Left = leftExpr
}



func (a *Add) SetRightExpr(rightExpr *expression.NumericExpression) {
	a.Right = rightExpr
}

func (a *Add) GetLeftExpr() *expression.NumericExpression {
	return a.Left
}



func (a *Add) GetRightExpr() *expression.NumericExpression {
	return a.Right
}

func (a *Add) Generate(ctx *codeobjects2.GenerateContext) string {
	return a.Left.Generate(ctx) + " + " + a.Right.Generate(ctx)

}

func (a *Add) Execute(ctx *codeobjects2.ExecutionContext) *exception.BaseException {
	// text and numeric

		leftCtx := ctx.Clone()
		rightCtx := ctx.Clone()
		if a.Left != nil {
			err := a.Left.Execute(leftCtx)
			if err != nil {
				return err
			}
		} else {
			leftCtx.NumericValue = 0
		}
		if a.Right != nil {
			err := a.Right.Execute(rightCtx)
			if err != nil {
				return err
			}
		} else {
			rightCtx.NumericValue = 0
		}
		ctx.NumericValue = leftCtx.NumericValue + rightCtx.NumericValue

	return nil

}

func NewAdd(line int, startPos int, endPos int, left *expression.NumericExpression, right *expression.NumericExpression) *Add {
	return &Add{BaseStatement: &codeobjects2.BaseStatement{Line: line, StartPos: startPos, EndPos: endPos}, Left: left, Right: right}
}


