package tests

import (
	"github.com/thanhhuy5902/Flux_lang/shared"
	"github.com/thanhhuy5902/Flux_lang/vm"
	"testing"
)

func TestVM_VarDeclaration(t *testing.T) {
	t.Run("create invalid number variables", func(t *testing.T) {
		myVM := vm.NewFluxVirtualMachine()
		result := myVM.Execute(&shared.ExecutionParams{
			EntryPoint: "var_declaration_test.flux",
		})

		if len(result.ErrorCollector.GetErrors()) != 0 {
			t.Errorf(result.ErrorCollector.GetErrors()[0].MessageFmt, result.ErrorCollector.GetErrors()[0].Args...)
		}

		if result.ElapsedTime > 1000 {
			t.Errorf("Execution time too long: %v", result.ElapsedTime)
		}
	})
	t.Run("create valid number variables", func(t *testing.T) {
		myVM := vm.NewFluxVirtualMachine()
		result := myVM.Execute(&shared.ExecutionParams{
			SourceCode: `
				num a {2}
				num b {3}
				num c {2 + 3}
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
		if a, err := myVM.GetVarTable().GetNumValue("a"); err != nil || a != 2 {
			t.Errorf("Expected 2, got %v", a)
		}
		if b, err := myVM.GetVarTable().GetNumValue("b"); err != nil || b != 3 {
			t.Errorf("Expected 3, got %v", b)
		}
		if c, err := myVM.GetVarTable().GetNumValue("c"); err != nil || c != 5 {
			t.Errorf("Expected 5, got %v", c)
		}
	})
	t.Run("create valid num var and assign to the other num var", func(t *testing.T) {
		myVM := vm.NewFluxVirtualMachine()
		result := myVM.Execute(&shared.ExecutionParams{
			SourceCode: `
				num a {2}
				num b {a}
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
		if a, err := myVM.GetVarTable().GetNumValue("a"); err != nil || a != 2 {
			t.Errorf("Expected 2, got %v", a)
		}
		if b, err := myVM.GetVarTable().GetNumValue("b"); err != nil || b != 2 {
			t.Errorf("Expected 2, got %v", b)
		}
	})
	t.Run("create valid text variables", func(t *testing.T) {
		myVM := vm.NewFluxVirtualMachine()
		result := myVM.Execute(&shared.ExecutionParams{
			SourceCode: `
				text a {'hello'}
				text b {'world'}
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
		if a, err := myVM.GetVarTable().GetTextValue("a"); err != nil || a != "hello" {
			t.Errorf("Expected hello, got %v", a)
		}
		if b, err := myVM.GetVarTable().GetTextValue("b"); err != nil || b != "world" {
			t.Errorf("Expected world, got %v", b)
		}
	})
}
