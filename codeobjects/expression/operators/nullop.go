package operators

import (
	"github.com/thanhhuy5902/Flux_lang/codeobjects"
	"github.com/thanhhuy5902/Flux_lang/codeobjects/expression"
	"github.com/thanhhuy5902/Flux_lang/exception"
)

type NullOperator struct {
}

func (n NullOperator) SetLeftExpr(leftExpr *expression.NumericExpression) {}

func (n NullOperator) SetRightExpr(rightExpr *expression.NumericExpression) {}

func (n NullOperator) GetLeftExpr() *expression.NumericExpression {
	return nil
}

func (n NullOperator) GetRightExpr() *expression.NumericExpression {
	return nil
}

func (n NullOperator) Execute(ctx *codeobjects.ExecutionContext) *exception.BaseException {
	return nil
}

var NullOp = NullOperator{}
