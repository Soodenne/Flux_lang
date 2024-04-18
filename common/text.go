package common

type Text struct {
	*Var[string]
}

func NewText(name string, value string) *Text {
	return &Text{
		Var: &Var[string]{
			name:  name,
			value: value,
		},
	}
}
