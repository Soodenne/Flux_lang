package expression

import (
	"fmt"
	codeobjects2 "github.com/thanhhuy5902/Flux_lang/codeobjects"
	"github.com/thanhhuy5902/Flux_lang/exception"
)

type LogicalExpression struct {
	*codeobjects2.BaseStatement
	LeftExpr  *NumericExpression
	Op        LogicalOperator
	RightExpr *NumericExpression
	Value     bool
	GetVar    *GetVar
}

func (l LogicalExpression) Generate(ctx *codeobjects2.GenerateContext) string {
	if l.GetVar != nil {
		return l.GetVar.Generate(ctx)
	}

	if l.LeftExpr == nil && l.RightExpr == nil {
		return fmt.Sprintf("%v", l.Value)
	}

	return l.Op.Generate(ctx)
}

func (l LogicalExpression) Execute(ctx *codeobjects2.ExecutionContext) *exception.BaseException {
	if l.GetVar != nil {
		return l.GetVar.Execute(ctx)
	}

	if l.LeftExpr == nil && l.RightExpr == nil {
		ctx.BoolValue = l.Value
		return nil
	}
	l.Op.SetLeftExpr(l.LeftExpr)
	l.Op.SetRightExpr(l.RightExpr)
	return l.Op.Execute(ctx)
}

func NewLogicalExpression(line int, startPos int, endPos int, leftExpr *NumericExpression, operator LogicalOperator, rightExpr *NumericExpression, value bool) *LogicalExpression {
	return &LogicalExpression{BaseStatement: &codeobjects2.BaseStatement{Line: line, StartPos: startPos, EndPos: endPos}, LeftExpr: leftExpr, Op: operator, RightExpr: rightExpr, Value: value}
}
