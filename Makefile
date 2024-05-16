build-vm:
	@echo "Building VM"
	go build -o bin/flux.exe cmd/vm/main.go

build-compiler:
	@echo "Building Compiler"
	go build -o bin/fluxc.exe cmd/compiler/main.go