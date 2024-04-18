package common

type InternalError struct {
	Err     error
	Factor  string
	Line    int
	PosFrom int
	PosTo   int
}

func NewInternalError(err error, factor string, line, posFrom, posTo int) *InternalError {
	return &InternalError{
		Err:     err,
		Factor:  factor,
		Line:    line,
		PosFrom: posFrom,
		PosTo:   posTo,
	}
}
