package common

type Boolean struct {
	*Var[bool]
}

func NewBoolean(name string, value bool) *Boolean {
	return &Boolean{
		Var: &Var[bool]{
			name:  name,
			value: value,
		},
	}
}
