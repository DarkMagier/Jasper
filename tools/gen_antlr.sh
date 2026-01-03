#!/usr/bin/env bash
set -euo pipefail

ANTLR_JAR="${1:-antlr4-4.13.2-complete.jar}"
PROJ="$(cd "$(dirname "$0")/.." && pwd)"
GRAMMAR_DIR="$PROJ/src/main/antlr/grammar"
OUT_DIR="$PROJ/src/main/java/gen/antlr/jasper"

mkdir -p "$OUT_DIR"

# ------------------------------------------------------------
# v0.0.04：加速容器闭环
# - ANTLR 生成源码体积很大，重复生成会显著拖慢 run_tests。
# - 这里用 g4 文件的 sha256 作为 stamp：未变化则跳过生成。
# ------------------------------------------------------------
STAMP_FILE="$OUT_DIR/.antlr_gen_stamp"
NEW_STAMP="$(sha256sum "$GRAMMAR_DIR/JasperLexer.g4" "$GRAMMAR_DIR/JasperParser.g4" | sha256sum | awk '{print $1}')"
OLD_STAMP=""
if [ -f "$STAMP_FILE" ]; then
  OLD_STAMP="$(cat "$STAMP_FILE" || true)"
fi

if [ "$NEW_STAMP" = "$OLD_STAMP" ]; then
  echo "[gen_antlr] grammar unchanged, skip generation"
  exit 0
fi

echo "[gen_antlr] grammar changed, regenerating..."
java -jar "$ANTLR_JAR" -Dlanguage=Java -visitor -no-listener -package gen.antlr.jasper -o "$OUT_DIR" \
  "$GRAMMAR_DIR/JasperLexer.g4" "$GRAMMAR_DIR/JasperParser.g4"

echo "$NEW_STAMP" > "$STAMP_FILE"
