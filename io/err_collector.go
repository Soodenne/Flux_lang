package io

import (
	"github.com/thanhhuy5902/Flux_lang/exception"
)

type ErrorCollector interface {
	CollectError(err *exception.BaseException)
	CollectWarning(err *exception.BaseException)
	GetErrors() []*exception.BaseException
	GetWarnings() []*exception.BaseException
}

type BaseErrorCollector struct {
	errors   []*exception.BaseException
	warnings []*exception.BaseException
}

func (b *BaseErrorCollector) CollectError(err *exception.BaseException) {
	b.errors = append(b.errors, err)
}

func (b *BaseErrorCollector) CollectWarning(err *exception.BaseException) {
	b.warnings = append(b.warnings, err)
}

func (b *BaseErrorCollector) GetErrors() []*exception.BaseException {
	return b.errors
}

func (b *BaseErrorCollector) GetWarnings() []*exception.BaseException {
	return b.warnings
}

func NewBaseErrorCollector() *BaseErrorCollector {
	return &BaseErrorCollector{
		errors:   make([]*exception.BaseException, 0),
		warnings: make([]*exception.BaseException, 0),
	}
}
