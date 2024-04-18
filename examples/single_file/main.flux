num a {2}

@fun sum(a, b) -> num {
    @if a > b {
        @return a
    } @else {
        @return b
    }
}