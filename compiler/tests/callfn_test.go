package tests

import (
	"github.com/thanhhuy5902/Flux_lang/compiler"
	"github.com/thanhhuy5902/Flux_lang/shared"
	"testing"
)

func TestCompiler_CallFn(t *testing.T) {
	myCompiler := compiler.NewFluxCompiler()
	result := myCompiler.Compile(&shared.CompilationParams{
		SourceCode: `
			out(2+3)
		`,
	})
	if len(result.ErrorCollector.GetErrors()) != 0 {
		t.Errorf(result.ErrorCollector.GetErrors()[0].MessageFmt, result.ErrorCollector.GetErrors()[0].Args...)
	}
	if result.ElapsedTime > 1000 {
		t.Errorf("Execution time too long: %v", result.ElapsedTime)
	}
}
