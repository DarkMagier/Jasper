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

# ------------------------------------------------------------
# v0.0.04：加速编译
# - 关闭调试信息/注解处理/大量 warning，可显著降低 javac 时间，避免容器超时。
# ------------------------------------------------------------
JAVAC_OPTS=(
  -J-Xmx1024m
  -g:none
  -nowarn
  -proc:none
  -encoding UTF-8
)

echo "[run_tests] 1) generate ANTLR sources"
bash tools/gen_antlr.sh "$ANTLR_JAR"

echo "[run_tests] 2) collect java sources"
bash tools/update_sources.sh

rm -rf out/classes
mkdir -p out/classes

# ------------------------------------------------------------
# v0.0.04：稳定闭环的“五阶段编译”
#
# 背景：ANTLR 生成的 JasperParser.java 体积很大，单次 javac（@sources.txt）在部分容器/CI
# 环境中容易因为耗时/无输出而被中断。
#
# 策略：把编译拆成 4 个阶段（lexer -> parser+visitor -> main -> tests），每阶段都有
# 明确输出，既稳定又可诊断。
# ------------------------------------------------------------

GEN_DIR="src/main/java/gen/antlr/jasper"

echo "[run_tests] 3-1) compile generated: JasperLexer"
javac "${JAVAC_OPTS[@]}" -cp "$ANTLR_RT" -d out/classes "$GEN_DIR/JasperLexer.java"

echo "[run_tests] 3-2) compile generated: JasperParser + Visitor"
# 注意：JasperParser.java 会引用 JasperParserVisitor；visitor 又引用 parser 的内部 Context 类型。
# 因此需要把 JasperParser.java / JasperParserVisitor.java / JasperParserBaseVisitor.java 放在同一次 javac 调用里。
javac "${JAVAC_OPTS[@]}" -cp "$ANTLR_RT:$PROJ/out/classes" -d out/classes \
  "$GEN_DIR/JasperParser.java" \
  "$GEN_DIR/JasperParserVisitor.java" \
  "$GEN_DIR/JasperParserBaseVisitor.java"

echo "[run_tests] 3-3) compile main sources (excluding gen/antlr)"
find src/main/java -name "*.java" ! -path "$GEN_DIR/*" | sort > main_sources.txt
javac "${JAVAC_OPTS[@]}" -cp "$CP:$PROJ/out/classes" -d out/classes @main_sources.txt

echo "[run_tests] 3-4) compile tests"
find src/test/java -name "*.java" | sort > test_sources.txt
javac "${JAVAC_OPTS[@]}" -cp "$CP:$PROJ/out/classes" -d out/classes @test_sources.txt

echo "[run_tests] 4) run tests"
java -ea -cp "$CP:$PROJ/out/classes" app.jackiey.jasper.tests.LanguageTests

echo "[run_tests] ALL TESTS PASSED"
