#!/usr/bin/env bash
set -euo pipefail

PROJ="$(cd "$(dirname "$0")/.." && pwd)"
cd "$PROJ"

# 说明：
# - 不依赖 Maven：直接用 find 收集源码列表。
# - 生成的 ANTLR 源码在 src/main/java/gen/antlr/jasper 下，也会被纳入 sources.txt。

rm -f sources.txt

if [ -d "src/test/java" ]; then
  find src/main/java src/test/java -name "*.java" | sort > sources.txt
else
  find src/main/java -name "*.java" | sort > sources.txt
fi

echo "[update_sources] wrote $(wc -l < sources.txt) java files to sources.txt"
