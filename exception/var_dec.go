package exception

import "github.com/antlr4-go/antlr/v4"

type VarDeclarationException struct {
	token  antlr.Token
	stream antlr.IntStream
}

func (v VarDeclarationException) GetOffendingToken() antlr.Token {
	//TODO implement me
	panic("implement me")
}

func (v VarDeclarationException) GetMessage() string {
	return "Variable declaration exception"
}

func (v VarDeclarationException) GetInputStream() antlr.IntStream {
	//TODO implement me
	panic("implement me")
}

func NewVarDeclarationException(token antlr.Token, stream antlr.IntStream) *VarDeclarationException {
	return &VarDeclarationException{token, stream}
}
