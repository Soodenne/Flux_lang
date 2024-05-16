package expression

import (
	"fmt"
	codeobjects2 "github.com/thanhhuy5902/Flux_lang/codeobjects"
	"github.com/thanhhuy5902/Flux_lang/exception"
)

type NumericExpression struct {
	*codeobjects2.BaseStatement
	LeftExpr  *NumericExpression
	Op        Operator
	RightExpr *NumericExpression
	Value     float64
	GetVar    *GetVar
}

func (n NumericExpression) Generate(ctx *codeobjects2.GenerateContext) string {

	if n.GetVar != nil {
		return n.GetVar.Generate(ctx)
	}

	if n.LeftExpr == nil && n.RightExpr == nil {
		return fmt.Sprintf("%v", n.Value)
	}

	return n.Op.Generate(ctx)

}

func (n NumericExpression) Execute(ctx *codeobjects2.ExecutionContext) *exception.BaseException {

	if n.GetVar != nil {
		return n.GetVar.Execute(ctx)
	}

	if n.LeftExpr == nil && n.RightExpr == nil {
		ctx.NumericValue = n.Value

		return nil
	}

	n.Op.SetLeftExpr(n.LeftExpr)
	n.Op.SetRightExpr(n.RightExpr)
	return n.Op.Execute(ctx)
}

func NewNumericExpression(line int, startPos int, endPos int, leftExpr *NumericExpression, operator Operator, rightExpr *NumericExpression, value float64) *NumericExpression {
	return &NumericExpression{BaseStatement: &codeobjects2.BaseStatement{Line: line, StartPos: startPos, EndPos: endPos}, LeftExpr: leftExpr, Op: operator, RightExpr: rightExpr, Value: value}
}
