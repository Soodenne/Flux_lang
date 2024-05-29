package exception

func NewBaseException(s string) *BaseException {
	return &BaseException{Message: s}
}
