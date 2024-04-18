package core

import (
	"testing"
)

func TestVarTable_Exists(t *testing.T) {
	table := NewVarTable()
	if table.mainTable == nil {
		t.Error("cannot create mainTable")
	}
	if table.numTable == nil {
		t.Error("cannot create numTable")
	}
	t.Run("create a generic var", func(t *testing.T) {
		err := table.Set("var1", VarTypeNum, "2")
		if err != nil {
			t.Error("cannot create var1")
		}
		if !table.Exists("var1") {
			t.Error("var1 should exist")
		}
		err = table.Set("var1", VarTypeNum, "100")
		if err == nil {
			t.Error("var1 must not be created again")
		}
		table.Remove("var1")
		if table.Exists("var1") {
			t.Error("var1 should not exist")
		}
	})
	t.Run("create a number var", func(t *testing.T) {
		err := table.SetNum("var2", 2)
		if err != nil {
			t.Error("cannot create var2")
		}
		if !table.Exists("var2") {
			t.Error("var2 should exist")
		}
		err = table.SetNum("var2", 100)
		if err == nil {
			t.Error("var2 must not be created again")
		}

		varValue, err := table.GetNumValue("var2")
		if err != nil {
			t.Error("cannot get var2 value")
		}

		if varValue != 2 {
			t.Error("var2 value should be 2")
		}

		table.Remove("var2")
		if table.Exists("var2") {
			t.Error("var2 should not exist")
		}
	})
}
