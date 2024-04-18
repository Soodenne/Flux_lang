package functions

import (
	"fmt"
	"github.com/thanhhuy5902/Flux_lang/codeobjects"
	"github.com/thanhhuy5902/Flux_lang/exception"
	"strings"
)

type Out struct {
	*BaseFunction
	Args *Args
}

func (l Out) Generate(ctx *codeobjects.GenerateContext) string {
	coutTxt := ""
	argsTxt := l.Args.Generate(ctx)
	for i, arg := range strings.Split(argsTxt, ",") {
		if i > 0 {
			coutTxt += " << "
		}
		coutTxt += arg
	}
	return fmt.Sprintf("std::cout << %v << std::endl;", coutTxt)
}

func (l Out) Execute(ctx *codeobjects.ExecutionContext) *exception.BaseException {
	if len(l.Args.Exprs) == 0 {
		return &exception.BaseException{
			MessageFmt: "log function requires at least one argument",
			Line:       l.Line,
			StartPos:   l.StartPos,
			EndPos:     l.EndPos,
		}
	}
	if len(l.Args.Exprs) == 1 {
		// check if the argument is a math expression
		err := l.Args.Execute(ctx)
		if err != nil {
			return err
		}
		if len(ctx.Args) == 1 {
			fmt.Printf(ctx.Args[0].RawValue)
		}
	}
	return nil
}

func NewOut(args *Args) *Out {
	return &Out{
		&BaseFunction{
			Args:       args,
			ReturnType: "",
		},
		args,
	}
}
