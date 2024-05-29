package expression

import (
	"github.com/thanhhuy5902/Flux_lang/codeobjects"
	"github.com/thanhhuy5902/Flux_lang/core"
	"github.com/thanhhuy5902/Flux_lang/exception"
)

type GetVar struct {
	*codeobjects.BaseStatement
	VarName string
}

func (g GetVar) Generate(ctx *codeobjects.GenerateContext) string {
	return g.VarName
}

func (g GetVar) Execute(ctx *codeobjects.ExecutionContext) *exception.BaseException {
	entry, err := ctx.VarTable.Get(g.VarName)
	if err != nil {
		return err
	}
	if entry == nil {
		return &exception.BaseException{
			MessageFmt: "Variable %v not found",
			Args:       []interface{}{g.VarName},
			Line:       g.GetLine(),
			StartPos:   g.GetStartPos(),
			EndPos:     g.GetEndPos(),
		}
	}
	if entry.Type == core.VarTypeNum {
		value, err := ctx.VarTable.GetNumValue(g.VarName)
		if err != nil {
			return &exception.BaseException{
				MessageFmt: "Invalid number format %v",
				Args:       []interface{}{entry.RawValue},
				Line:       g.GetLine(),
				StartPos:   g.GetStartPos(),
				EndPos:     g.GetEndPos(),
			}
		}
		ctx.NumericValue = value
	}
	if entry.Type == core.VarTypeText {
		value, err := ctx.VarTable.GetTextValue(g.VarName)
		if err != nil {
			return &exception.BaseException{
				MessageFmt: "Invalid string format %v",
				Args:       []interface{}{entry.RawValue},
				Line:       g.GetLine(),
				StartPos:   g.GetStartPos(),
				EndPos:     g.GetEndPos(),
			}
		}
		ctx.TextValue = value
	}
	return nil
}
