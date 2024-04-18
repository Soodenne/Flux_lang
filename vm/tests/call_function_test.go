package tests

import (
	"github.com/thanhhuy5902/Flux_lang/shared"
	"github.com/thanhhuy5902/Flux_lang/vm"
	"testing"
)

func TestVM_CallFunction(t *testing.T) {
	t.Run("call built in function", func(t *testing.T) {
		myVM := vm.NewFluxVirtualMachine()
		result := myVM.Execute(&shared.ExecutionParams{
			SourceCode: `
				num a {2}
				num b {3}
				num c {2 + 3}
				log(a+b+c)
			`,
		})
		if len(result.ErrorCollector.GetErrors()) != 0 {
			t.Errorf(result.ErrorCollector.GetErrors()[0].MessageFmt, result.ErrorCollector.GetErrors()[0].Args...)
		}
		if result.RuntimeException != nil {
			t.Errorf(result.RuntimeException.MessageFmt, result.RuntimeException.Args...)
		}
		if result.ElapsedTime > 1000 {
			t.Errorf("Execution time too long: %v", result.ElapsedTime)
		}
	})
}
