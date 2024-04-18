package common

type Number struct {
	*Var[float64]
}

func NewNumber(name string, value float64) *Number {
	return &Number{
		Var: &Var[float64]{
			name:  name,
			value: value,
		},
	}
}
