package functions

import (
	"github.com/thanhhuy5902/Flux_lang/codeobjects"
	"github.com/thanhhuy5902/Flux_lang/common"
	"github.com/thanhhuy5902/Flux_lang/exception"
)

type BaseFunction struct {
	*codeobjects.BaseStatement
	Args       *Args
	ReturnType common.FluxType
}

func (b BaseFunction) Generate(ctx *codeobjects.GenerateContext) string {
	return ""
}

func (b BaseFunction) Execute(ctx *codeobjects.ExecutionContext) *exception.BaseException {
	return nil
}
