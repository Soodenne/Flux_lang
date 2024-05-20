package declarations

import (
	"fmt"
	codeobjects2 "github.com/thanhhuy5902/Flux_lang/codeobjects"
	"github.com/thanhhuy5902/Flux_lang/codeobjects/expression"
	"github.com/thanhhuy5902/Flux_lang/common"
	"github.com/thanhhuy5902/Flux_lang/exception"
	"strconv"
)

type VarDeclaration struct {
	*codeobjects2.BaseStatement
	Name     string
	Type     common.FluxType
	RawValue string
	Expr     *expression.MathExpression
	ExprText *expression.TextExpression
}

func (v VarDeclaration) Generate(ctx *codeobjects2.GenerateContext) string {
	// to golang type
	varType := "double"
	if v.Type == common.FluxTypeString {
		varType = "string"
	} else if v.Type == common.FluxTypeBool {
		varType = "bool"
	} else if v.Type == common.FluxTypeNumber {
		varType = "double"
	}
	if v.Expr != nil {
		return fmt.Sprintf("%v %v = %v;", varType, v.Name, v.Expr.Generate(ctx))
	} else if v.RawValue != "" {
		return fmt.Sprintf("%v %v = %v;", varType, v.Name, v.RawValue)
	} else if v.ExprText != nil {
		return fmt.Sprintf("%v %v = %v;", varType, v.Name, v.ExprText.Generate(ctx))

	}
	return fmt.Sprintf("%v %v;", v.Name, varType)
}

func (v VarDeclaration) Execute(ctx *codeobjects2.ExecutionContext) *exception.BaseException {
	exprCtx := ctx.Clone()
	if v.Expr != nil {
		err := v.Expr.Execute(exprCtx)
		if err != nil {
			return err
		}
		if v.Type == common.FluxTypeNumber {
			err := ctx.VarTable.SetNum(v.Name, exprCtx.NumericValue)
			if err != nil {
				return err
			}
		}
		if v.Type == common.FluxTypeString {
			err := ctx.VarTable.SetText(v.Name, exprCtx.TextValue)
			if err != nil {
				return err
			}
		}
		if v.Type == common.FluxTypeBool {
			err := ctx.VarTable.SetBool(v.Name, exprCtx.BoolValue)
			if err != nil {
				return err
			}
		}
	} else if v.RawValue != "" {
		if v.Type == common.FluxTypeNumber {
			value, parseErr := strconv.ParseFloat(v.RawValue, 64)
			if parseErr != nil {
				return &exception.BaseException{
					MessageFmt: "Invalid number value: %s",
					Args:       []interface{}{v.RawValue},
					Line:       v.GetLine(),
					StartPos:   v.GetStartPos(),
					EndPos:     v.GetEndPos(),
				}
			}
			err := ctx.VarTable.SetNum(v.Name, value)
			if err != nil {
				return err
			}
		}
		if v.Type == common.FluxTypeString {
			err := ctx.VarTable.SetText(v.Name, v.RawValue)
			if err != nil {
				return err
			}
		}
		if v.Type == common.FluxTypeBool {
			value, parseErr := strconv.ParseBool(v.RawValue)
			if parseErr != nil {
				return &exception.BaseException{
					MessageFmt: "Invalid boolean value: %s",
					Args:       []interface{}{v.RawValue},
					Line:       v.GetLine(),
					StartPos:   v.GetStartPos(),
					EndPos:     v.GetEndPos(),
				}
			}
			err := ctx.VarTable.SetBool(v.Name, value)
			if err != nil {
				return err
			}
		}
	} else if v.ExprText != nil {
		err := v.ExprText.Execute(ctx)
		if err != nil {
			return err
		}
		if v.Type == common.FluxTypeString {
			err := ctx.VarTable.SetText(v.Name, ctx.TextValue)
			if err != nil {
				return err
			}
		}

	} else {
		// Set default value
		if v.Type == common.FluxTypeNumber {
			err := ctx.VarTable.SetNum(v.Name, 0)
			if err != nil {
				return err
			}
		}
	}

	return nil
}

func NewVarDeclaration(line int, startPos int, endPos int, name string, type_ common.FluxType, rawValue string, expr *expression.MathExpression) *VarDeclaration {
	return &VarDeclaration{BaseStatement: &codeobjects2.BaseStatement{Line: line, StartPos: startPos, EndPos: endPos}, Name: name, Type: type_, RawValue: rawValue, Expr: expr}
}
