package io

import "log"

type Logger interface {
	Infof(format string, args ...interface{})
	Errorf(format string, args ...interface{})
	Warningf(format string, args ...interface{})
}

type BaseLogger struct {
}

func (l *BaseLogger) Infof(format string, args ...interface{}) {
	// print [INFO] data in white
	log.Printf("\033[34m [INFO] \033[0m"+format+"", args...)
}

func (l *BaseLogger) Errorf(format string, args ...interface{}) {
	// print [ERROR] data in red

	log.Printf("\033[31m [ERROR] \u001B[0m"+format+" ", args...)

}

func (l *BaseLogger) Warningf(format string, args ...interface{}) {
	// print datetime [WARNING] data in yellow
	log.Printf("\033[33m [WARNING] \033[0m"+format+"", args...)
}

func NewBaseLogger() *BaseLogger {
	return &BaseLogger{}
}

type EmptyLogger struct{}

func (e EmptyLogger) Infof(format string, args ...interface{}) {

}

func (e EmptyLogger) Errorf(format string, args ...interface{}) {

}

func (e EmptyLogger) Warningf(format string, args ...interface{}) {

}

func NewEmptyLogger() *EmptyLogger {
	return &EmptyLogger{}
}
