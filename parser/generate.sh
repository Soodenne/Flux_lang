#!/bin/sh
alias antlr4='java -Xmx500M -cp "./antlr-4.13.1-complete.jar:$CLASSPATH" org.antlr.v4.Tool'
antlr4 -Dlanguage=Go -visitor -listener -encoding UTF8 -package parsing Flux.g4 Primitives.g4 -o ../parsing -lib ./gen
#for file in *.g4
#do
#  subpackage=${file%.*} # remove the .g4 extension to get the subpackage name
#  mkdir -p ../parsing/$subpackage # create the subpackage directory
#  antlr4 -Dlanguage=Go -no-visitor -package parsing $file -o ../parsing/$subpackage
#done