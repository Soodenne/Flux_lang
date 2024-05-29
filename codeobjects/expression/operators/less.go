package operators

import (
	codeobjects2 "github.com/thanhhuy5902/Flux_lang/codeobjects"
	"github.com/thanhhuy5902/Flux_lang/codeobjects/expression"
	"github.com/thanhhuy5902/Flux_lang/exception"
)

type Less struct {
	*codeobjects2.BaseStatement
	Left  *expression.NumericExpression
	Right *expression.NumericExpression
}

func (l *Less) SetLeftExpr(leftExpr *expression.NumericExpression) {
	l.Left = leftExpr
}

func (l *Less) SetRightExpr(rightExpr *expression.NumericExpression) {
	l.Right = rightExpr
}

func (l *Less) GetLeftExpr() *expression.NumericExpression {
	return l.Left
}

func (l *Less) GetRightExpr() *expression.NumericExpression {
	return l.Right
}

func (l *Less) Generate(ctx *codeobjects2.GenerateContext) string {
	return l.Left.Generate(ctx) + " < " + l.Right.Generate(ctx)
}

func (l *Less) Execute(ctx *codeobjects2.ExecutionContext) *exception.BaseException {
	if l.Left == nil || l.Right == nil {
		return exception.NewBaseException("Left or right expression is nil")
	}

	leftCtx := ctx.Clone()
	rightCtx := ctx.Clone()

	if l.Left != nil {
		err := l.Left.Execute(leftCtx)
		if err != nil {
			return err
		}
	} else {
		leftCtx.NumericValue = 0
	}
	if l.Right != nil {
		err := l.Right.Execute(rightCtx)
		if err != nil {
			return err
		}
	} else {
		rightCtx.NumericValue = 0
	}

	if leftCtx.NumericValue < rightCtx.NumericValue {
		ctx.BoolValue = true
	} else {
		ctx.BoolValue = false
	}
	return nil
}

func NewLessThan(line int, startPos int, endPos int, left *expression.NumericExpression, right *expression.NumericExpression) *Less {
	return &Less{BaseStatement: &codeobjects2.BaseStatement{Line: line, StartPos: startPos, EndPos: endPos}, Left: left, Right: right}
}
