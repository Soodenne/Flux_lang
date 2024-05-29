package operators

import (
	codeobjects2 "github.com/thanhhuy5902/Flux_lang/codeobjects"
	"github.com/thanhhuy5902/Flux_lang/codeobjects/expression"
	"github.com/thanhhuy5902/Flux_lang/exception"
)

type Equal struct {
	*codeobjects2.BaseStatement
	Left  *expression.NumericExpression
	Right *expression.NumericExpression
}

func (e *Equal) SetLeftExpr(leftExpr *expression.NumericExpression) {
	e.Left = leftExpr
}

func (e *Equal) SetRightExpr(rightExpr *expression.NumericExpression) {
	e.Right = rightExpr
}

func (e *Equal) GetLeftExpr() *expression.NumericExpression {
	return e.Left
}

func (e *Equal) GetRightExpr() *expression.NumericExpression {
	return e.Right
}

func (e *Equal) Generate(ctx *codeobjects2.GenerateContext) string {
	return e.Left.Generate(ctx) + " = " + e.Right.Generate(ctx)
}

func (e *Equal) Execute(ctx *codeobjects2.ExecutionContext) *exception.BaseException {
	if e.Left == nil || e.Right == nil {
		return exception.NewBaseException("Left or right expression is nil")
	}

	leftCtx := ctx.Clone()
	rightCtx := ctx.Clone()

	if e.Left != nil {
		err := e.Left.Execute(leftCtx)
		if err != nil {
			return err
		}
	} else {
		leftCtx.NumericValue = 0
	}
	if e.Right != nil {
		err := e.Right.Execute(rightCtx)
		if err != nil {
			return err
		}
	} else {
		rightCtx.NumericValue = 0
	}

	if leftCtx.NumericValue == rightCtx.NumericValue {
		ctx.BoolValue = true
	} else {
		ctx.BoolValue = false
	}
	return nil
}

func NewEqual(line int, startPos int, endPos int, left *expression.NumericExpression, right *expression.NumericExpression) *Equal {
	return &Equal{BaseStatement: &codeobjects2.BaseStatement{Line: line, StartPos: startPos, EndPos: endPos}, Left: left, Right: right}
}
