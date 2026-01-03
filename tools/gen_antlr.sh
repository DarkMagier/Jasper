#!/usr/bin/env bash
set -euo pipefail

ANTLR_JAR="${1:-antlr4-4.13.2-complete.jar}"
PROJ="$(cd "$(dirname "$0")/.." && pwd)"
GRAMMAR_DIR="$PROJ/src/main/antlr/grammar"
OUT_DIR="$PROJ/src/main/java/gen/antlr/jasper"

mkdir -p "$OUT_DIR"

java -jar "$ANTLR_JAR" -Dlanguage=Java -visitor -no-listener -package gen.antlr.jasper -o "$OUT_DIR" "$GRAMMAR_DIR/JasperLexer.g4" "$GRAMMAR_DIR/JasperParser.g4"
