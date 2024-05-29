package operators

import (
	codeobjects2 "github.com/thanhhuy5902/Flux_lang/codeobjects"
	"github.com/thanhhuy5902/Flux_lang/codeobjects/expression"
	"github.com/thanhhuy5902/Flux_lang/exception"
)

type NotEqual struct {
	*codeobjects2.BaseStatement
	Left  *expression.NumericExpression
	Right *expression.NumericExpression
}

func (n *NotEqual) SetLeftExpr(leftExpr *expression.NumericExpression) {
	n.Left = leftExpr
}

func (n *NotEqual) SetRightExpr(rightExpr *expression.NumericExpression) {
	n.Right = rightExpr
}

func (n *NotEqual) GetLeftExpr() *expression.NumericExpression {
	return n.Left
}

func (n *NotEqual) GetRightExpr() *expression.NumericExpression {
	return n.Right
}

func (n *NotEqual) Generate(ctx *codeobjects2.GenerateContext) string {
	return n.Left.Generate(ctx) + " != " + n.Right.Generate(ctx)
}

func (n *NotEqual) Execute(ctx *codeobjects2.ExecutionContext) *exception.BaseException {
	if n.Left == nil || n.Right == nil {
		return exception.NewBaseException("Left or right expression is nil")
	}

	leftCtx := ctx.Clone()
	rightCtx := ctx.Clone()

	if n.Left != nil {
		err := n.Left.Execute(leftCtx)
		if err != nil {
			return err
		}
	} else {
		leftCtx.NumericValue = 0
	}
	if n.Right != nil {
		err := n.Right.Execute(rightCtx)
		if err != nil {
			return err
		}
	} else {
		rightCtx.NumericValue = 0
	}

	if leftCtx.NumericValue != rightCtx.NumericValue {
		ctx.BoolValue = true
	} else {
		ctx.BoolValue = false
	}
	return nil
}

func NewNotEqual(line int, startPos int, endPos int, left *expression.NumericExpression, right *expression.NumericExpression) *NotEqual {
	return &NotEqual{BaseStatement: &codeobjects2.BaseStatement{Line: line, StartPos: startPos, EndPos: endPos}, Left: left, Right: right}
}
