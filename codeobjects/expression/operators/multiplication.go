package operators

import (
	"github.com/thanhhuy5902/Flux_lang/codeobjects"
	"github.com/thanhhuy5902/Flux_lang/codeobjects/expression"
	"github.com/thanhhuy5902/Flux_lang/exception"
)

type Multiplication struct {
	*codeobjects.BaseStatement
	Left  *expression.NumericExpression
	Right *expression.NumericExpression
}

func (m *Multiplication) SetLeftExpr(leftExpr *expression.NumericExpression) {
	m.Left = leftExpr
}

func (m *Multiplication) SetRightExpr(rightExpr *expression.NumericExpression) {
	m.Right = rightExpr
}



func (m *Multiplication) GetLeftExpr() *expression.NumericExpression {
	return m.Left
}

func (m *Multiplication) GetRightExpr() *expression.NumericExpression {
	return m.Right
}

func (m *Multiplication) Generate(ctx *codeobjects.GenerateContext) string {
	return m.Left.Generate(ctx) + " * " + m.Right.Generate(ctx)
}

func (m *Multiplication) Execute(ctx *codeobjects.ExecutionContext) *exception.BaseException {
	leftCtx := ctx.Clone()
	rightCtx := ctx.Clone()
	if m.Left != nil {
		err := m.Left.Execute(leftCtx)
		if err != nil {
			return err
		}
	} else {
		leftCtx.NumericValue = 0
	}
	if m.Right != nil {
		err := m.Right.Execute(rightCtx)
		if err != nil {
			return err
		}
	} else {
		rightCtx.NumericValue = 0
	}
	ctx.NumericValue = leftCtx.NumericValue * rightCtx.NumericValue
	return nil

}

func NewMultiplication(line int, startPos int, endPos int, left *expression.NumericExpression, right *expression.NumericExpression) *Multiplication {
	return &Multiplication{BaseStatement: &codeobjects.BaseStatement{Line: line, StartPos: startPos, EndPos: endPos}, Left: left, Right: right}
}
