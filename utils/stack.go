package utils

type Stack[T any] struct {
	elements []T
}

func NewStack[T any]() *Stack[T] {
	return &Stack[T]{elements: make([]T, 0)}
}

func (s *Stack[T]) Push(element T) {
	s.elements = append(s.elements, element)
}

func (s *Stack[T]) Pop() *T {
	if s.IsEmpty() {
		return nil
	}
	element := s.elements[len(s.elements)-1]
	s.elements = s.elements[:len(s.elements)-1]
	return &element
}

func (s *Stack[T]) Peek() *T {
	if s.IsEmpty() {
		return nil
	}
	return &s.elements[len(s.elements)-1]
}

func (s *Stack[T]) IsEmpty() bool {
	return len(s.elements) == 0
}

func (s *Stack[T]) Enqueue(element T) {
	s.elements = append([]T{element}, s.elements...)
}

func (s *Stack[T]) Dequeue() *T {
	if s.IsEmpty() {
		return nil
	}
	element := s.elements[0]
	s.elements = s.elements[1:]
	return &element
}

func (s *Stack[T]) Front() *T {
	if s.IsEmpty() {
		return nil
	}
	return &s.elements[0]
}
