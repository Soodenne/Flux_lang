package shared

import (
	"github.com/thanhhuy5902/Flux_lang/io"
)

type CompilationParams struct {
	EntryPoint string `json:"entryPoint"`
	Verbose    bool   `json:"verbose"`
	SourceCode string `json:"sourceCode"`
	DisableIL  bool   `json:"disableIL"`
	ILPath     string `json:"ilPath"`
	Output     string `json:"output"`
}

type CompilationResult struct {
	ErrorCollector io.ErrorCollector
	ElapsedTime    int64 `json:"elapsedTime"`
}
