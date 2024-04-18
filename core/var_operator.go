package core

import (
	"errors"
	"github.com/thanhhuy5902/Flux_lang/exception"
)

const (
	VarTypeNum  = "num"
	VarTypeText = "text"
	VarTypeBool = "bool"
)

var (
	ErrVarNotFound = errors.New("variable not found")
	ErrVarExists   = errors.New("variable already exists")
)

type VarOperator interface {
	Set(name string, type_ string, rawValue string) *exception.BaseException
	Get(name string) (*VarTableEntry, *exception.BaseException)
	Exists(name string) bool
	Remove(name string)
	SetNum(name string, value float64) *exception.BaseException
	GetNumValue(name string) (float64, *exception.BaseException)
	SetText(name string, value string) *exception.BaseException
	GetTextValue(name string) (string, *exception.BaseException)
	SetBool(name string, value bool) *exception.BaseException
	GetBoolValue(name string) (bool, *exception.BaseException)
}
