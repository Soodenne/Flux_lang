package expression

import (
	codeobjects2 "github.com/thanhhuy5902/Flux_lang/codeobjects"
	"github.com/thanhhuy5902/Flux_lang/exception"
)

type MathExpression struct {
	*codeobjects2.BaseStatement
	NumericExpr *NumericExpression
	TextExpr    *TextExpression
	GetVar      *GetVar
	LogicalExpr *LogicalExpression
}

func (m MathExpression) Generate(ctx *codeobjects2.GenerateContext) string {
	if m.NumericExpr != nil {
		return m.NumericExpr.Generate(ctx)
	}
	if m.GetVar != nil {
		return m.GetVar.Generate(ctx)
	}
	if m.TextExpr != nil {
		return m.TextExpr.Generate(ctx)

	}
	if m.LogicalExpr != nil {
		return m.LogicalExpr.Generate(ctx)
	}
	return ""
}

func (m MathExpression) Execute(ctx *codeobjects2.ExecutionContext) *exception.BaseException {
	if m.NumericExpr != nil {
		return m.NumericExpr.Execute(ctx)
	}

	if m.LogicalExpr != nil {
		return m.LogicalExpr.Execute(ctx)
	}

	if m.GetVar != nil {
		return m.GetVar.Execute(ctx)
	}

	if m.TextExpr != nil {
		return m.TextExpr.Execute(ctx)

	}
	return nil
}
func NewMathExpression(line int, startPos int, endPos int, numericExpr *NumericExpression, textExpr *TextExpression, logicExpr *LogicalExpression) *MathExpression {
	return &MathExpression{BaseStatement: &codeobjects2.BaseStatement{Line: line, StartPos: startPos, EndPos: endPos}, NumericExpr: numericExpr, TextExpr: textExpr, LogicalExpr: logicExpr}
}
