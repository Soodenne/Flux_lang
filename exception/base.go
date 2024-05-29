package exception

type BaseException struct {
	MessageFmt string
	Args       []interface{}
	Err        error
	Line       int
	StartPos   int
	EndPos     int
	Message    string
}
