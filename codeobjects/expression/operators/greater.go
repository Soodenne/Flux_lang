package operators

import (
	codeobjects2 "github.com/thanhhuy5902/Flux_lang/codeobjects"
	"github.com/thanhhuy5902/Flux_lang/codeobjects/expression"
	"github.com/thanhhuy5902/Flux_lang/exception"
)

type Greater struct {
	*codeobjects2.BaseStatement
	Left  *expression.NumericExpression
	Right *expression.NumericExpression
}

func (g *Greater) SetLeftExpr(leftExpr *expression.NumericExpression) {
	g.Left = leftExpr
}

func (g *Greater) SetRightExpr(rightExpr *expression.NumericExpression) {
	g.Right = rightExpr
}

func (g *Greater) GetLeftExpr() *expression.NumericExpression {
	return g.Left
}

func (g *Greater) GetRightExpr() *expression.NumericExpression {
	return g.Right
}

func (g *Greater) Generate(ctx *codeobjects2.GenerateContext) string {
	return g.Left.Generate(ctx) + " > " + g.Right.Generate(ctx)
}

func (g *Greater) Execute(ctx *codeobjects2.ExecutionContext) *exception.BaseException {
	if g.Left == nil || g.Right == nil {
		return exception.NewBaseException("Left or right expression is nil")
	}

	leftCtx := ctx.Clone()
	rightCtx := ctx.Clone()

	if g.Left != nil {
		err := g.Left.Execute(leftCtx)
		if err != nil {
			return err
		}
	} else {
		leftCtx.NumericValue = 0
	}
	if g.Right != nil {
		err := g.Right.Execute(rightCtx)
		if err != nil {
			return err
		}
	} else {
		rightCtx.NumericValue = 0
	}

	if leftCtx.NumericValue > rightCtx.NumericValue {
		ctx.BoolValue = true
	} else {
		ctx.BoolValue = false
	}
	return nil
}

func NewGreaterThan(line int, startPos int, endPos int, left *expression.NumericExpression, right *expression.NumericExpression) *Greater {
	return &Greater{BaseStatement: &codeobjects2.BaseStatement{Line: line, StartPos: startPos, EndPos: endPos}, Left: left, Right: right}
}
