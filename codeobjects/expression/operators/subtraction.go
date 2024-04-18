package operators

import (
	"github.com/thanhhuy5902/Flux_lang/codeobjects"
	"github.com/thanhhuy5902/Flux_lang/codeobjects/expression"
	"github.com/thanhhuy5902/Flux_lang/exception"
)

type Subtraction struct {
	*codeobjects.BaseStatement
	Left  *expression.NumericExpression
	Right *expression.NumericExpression
}

func (s *Subtraction) SetLeftExpr(leftExpr *expression.NumericExpression) {
	s.Left = leftExpr
}

func (s *Subtraction) SetRightExpr(rightExpr *expression.NumericExpression) {
	s.Right = rightExpr
}

func (s *Subtraction) GetLeftExpr() *expression.NumericExpression {
	return s.Left
}

func (s *Subtraction) GetRightExpr() *expression.NumericExpression {
	return s.Right
}

func (s *Subtraction) Generate(ctx *codeobjects.GenerateContext) string {
	return s.Left.Generate(ctx) + " - " + s.Right.Generate(ctx)
}

func (s *Subtraction) Execute(ctx *codeobjects.ExecutionContext) *exception.BaseException {
	leftCtx := ctx.Clone()
	rightCtx := ctx.Clone()
	if s.Left != nil {
		err := s.Left.Execute(leftCtx)
		if err != nil {
			return err
		}
	} else {
		leftCtx.NumericValue = 0
	}
	if s.Right != nil {
		err := s.Right.Execute(rightCtx)
		if err != nil {
			return err
		}
	} else {
		rightCtx.NumericValue = 0
	}
	ctx.NumericValue = leftCtx.NumericValue - rightCtx.NumericValue
	return nil
}

func NewSubtraction(line int, startPos int, endPos int, left *expression.NumericExpression, right *expression.NumericExpression) *Subtraction {
	return &Subtraction{BaseStatement: &codeobjects.BaseStatement{Line: line, StartPos: startPos, EndPos: endPos}, Left: left, Right: right}
}
