#!/usr/bin/env bash
set -euo pipefail

PROJ="$(cd "$(dirname "$0")/.." && pwd)"
cd "$PROJ"

# 约定：本工程不依赖 Maven/JUnit，采用 javac + Java assertions 跑 tests。

ANTLR_JAR="$PROJ/tools/lib/antlr4-4.13.2-complete.jar"
ANTLR_RT="$PROJ/tools/lib/antlr4-runtime-4.13.2.jar"
BB="$PROJ/tools/lib/byte-buddy-1.18.3.jar"
BBA="$PROJ/tools/lib/byte-buddy-agent-1.18.3.jar"

CP="$ANTLR_RT:$BB:$BBA"

echo "[run_tests] 1) generate ANTLR sources"
bash tools/gen_antlr.sh "$ANTLR_JAR"

echo "[run_tests] 2) collect java sources"
bash tools/update_sources.sh

rm -rf out/classes
mkdir -p out/classes

echo "[run_tests] 3) compile (方案A：一次性编译，给 javac 足够 heap)"
set +e
javac -J-Xmx1024m -encoding UTF-8 -cp "$CP" -d out/classes @sources.txt
JAVAC_CODE=$?
set -e

if [ $JAVAC_CODE -ne 0 ]; then
  echo "[run_tests] 方案A 失败（javac exit=$JAVAC_CODE），尝试方案B：分阶段编译" >&2

  # 方案B：先编译生成的 parser/visitor，再编译其它源码（第二阶段 classpath 必须包含 out/classes）
  GEN_PREFIX="src/main/java/gen/antlr/jasper"
  find "$GEN_PREFIX" -name "*.java" | sort > gen_sources.txt
  grep -v "^${GEN_PREFIX}" sources.txt > other_sources.txt

  echo "[run_tests] 3B-1) compile generated (gen/antlr)"
  javac -J-Xmx1024m -encoding UTF-8 -cp "$ANTLR_RT" -d out/classes @gen_sources.txt

  echo "[run_tests] 3B-2) compile project sources (with out/classes in classpath)"
  javac -J-Xmx1024m -encoding UTF-8 -cp "$CP:$PROJ/out/classes" -d out/classes @other_sources.txt
fi

echo "[run_tests] 4) run tests"
java -ea -cp "$CP:$PROJ/out/classes" app.jackiey.jasper.tests.LanguageTests

echo "[run_tests] ALL TESTS PASSED"
