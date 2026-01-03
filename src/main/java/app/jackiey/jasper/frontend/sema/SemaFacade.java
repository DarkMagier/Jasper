package app.jackiey.jasper.frontend.sema;

import app.jackiey.jasper.frontend.ast.nodes.FunctionDecl;
import app.jackiey.jasper.frontend.ast.nodes.Item;
import app.jackiey.jasper.frontend.ast.nodes.Program;
import app.jackiey.jasper.frontend.diag.DiagnosticSink;

/**
 * 语义检查入口（v0.0.04）。
 *
 * 本阶段目标：
 * - 局部变量 definite assignment（首次读取前必须在所有路径赋值）
 * - 最小空安全：T / T? + null + ?. + ?? + !
 * - where T is NonNull：约束解析与最小约束检查
 */
public final class SemaFacade {
    public void run(Program program, DiagnosticSink diag) {
        for (Item it : program.items) {
            if (it instanceof FunctionDecl) {
                FunctionDecl f = (FunctionDecl) it;
                if (f.bodyAst != null) {
                    new FunctionBodyChecker().check(f, diag);
                }
            }
        }
    }
}
