package parser

import (
	"github.com/antlr4-go/antlr/v4"
	fluxIO "github.com/thanhhuy5902/Flux_lang/io"
	"github.com/thanhhuy5902/Flux_lang/parsing"
)

func Parse(data string, errorCollector fluxIO.ErrorCollector, logger fluxIO.Logger) *FluxProgramParser {

	input := antlr.NewInputStream(string(data))
	// create lexer
	lexer := parsing.NewPrimitives(input)
	// create parser
	parser := parsing.NewFlux(antlr.NewCommonTokenStream(lexer, 0))
	// create traverser
	fluxProgramParser := NewFluxProgramParser(logger, errorCollector)
	// add traverser to parser
	parser.AddParseListener(fluxProgramParser)
	// start parsing
	parser.Program()

	return fluxProgramParser
}
