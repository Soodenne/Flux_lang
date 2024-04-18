build-vm:
	@echo "Building VM"
	go build -o bin/flux cmd/vm/main.go

build-compiler:
	@echo "Building Compiler"
	go build -o bin/fluxc cmd/compiler/main.go