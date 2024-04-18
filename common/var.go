package common

type FluxType string

const (
	FluxTypeNumber FluxType = "num"
	FluxTypeString FluxType = "text"
	FluxTypeBool   FluxType = "bool"
	FluxTypeNone   FluxType = "none"
)

type Var[T any] struct {
	name  string
	value T
}

type Identifiable[T any] interface {
	GetName() string
	GetValue() T
	SetValue(value T)
}

func (v *Var[T]) GetName() string {
	return v.name
}

func (v *Var[T]) GetValue() T {
	return v.value
}

func (v *Var[T]) SetValue(value T) {
	v.value = value
}
