@echo off

REM Set environment variable for classpath
set CLASSPATH=./antlr-4.13.1-complete.jar;%CLASSPATH%

REM Run ANTLR4 with specified options
java -Xmx500M -cp "%CLASSPATH%" org.antlr.v4.Tool ^
  -Dlanguage=Go ^
  -visitor ^
  -listener ^
  -encoding UTF8 ^
  -package parsing ^
  Flux.g4 Primitives.g4 ^
  -o ../parsing ^
  -lib ./gen

echo ANTLR4 code generation complete.