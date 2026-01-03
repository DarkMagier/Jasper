package app.jackiey.jasper.backend.targets.native_ll;

import app.jackiey.jasper.backend.api.Artifact;
import app.jackiey.jasper.backend.api.Target;
import app.jackiey.jasper.backend.cgir.CgFunction;
import app.jackiey.jasper.backend.cgir.CgInst;
import app.jackiey.jasper.backend.cgir.CgProgram;
import app.jackiey.jasper.backend.lower.AstToCgir;
import app.jackiey.jasper.cli.JasperMain;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * day2 的原生后端（LLVM text）：仍然是 demo 级别。
 *
 * 兼容策略：
 * - 如果 CGIR 中存在 foo + __entry call foo(immA,immB)，则输出可运行的 demo LLVM IR。
 * - 如果只有 class/interface 降下来的 stub functions，则 __entry 为空实现，不会强行调用 foo。
 */
public final class LlvmTextBackend {

    public Artifact emit(CgProgram cg, JasperMain.CliOptions opt) throws IOException, InterruptedException {
        Path out = opt.out;
        if (out == null) {
            Files.createDirectories(Paths.get("target", "jasper"));
            out = Paths.get("target", "jasper", opt.target == Target.NATIVE ? "a.out" : "out.ll");
        } else {
            Path parent = out.toAbsolutePath().getParent();
            if (parent != null) Files.createDirectories(parent);
        }

        Path llPath = out;
        if (opt.target == Target.NATIVE) llPath = Paths.get(out.toAbsolutePath() + ".ll");

        writeLl(llPath, cg);

        if (opt.target == Target.LL) return new Artifact(llPath, this);

        Path binPath = out.toAbsolutePath();
        compileWithClang(llPath, binPath);
        return new Artifact(binPath, this);
    }

    private void writeLl(Path llPath, CgProgram cg) throws IOException {
        boolean hasFoo = false;
        boolean entryCallsFoo = false;
        long aImm = 1, bImm = 2;

        for (CgFunction fn : cg.functions) {
            if ("foo".equals(fn.name)) {
                hasFoo = true;
            }
            if (AstToCgir.ENTRY.equals(fn.name)) {
                for (CgInst inst : fn.body) {
                    if (inst instanceof CgInst.Call2I64) {
                        CgInst.Call2I64 c = (CgInst.Call2I64) inst;
                        // demo 仍只支持 call foo
                        if ("foo".equals(c.callee)) {
                            entryCallsFoo = true;
                            aImm = c.a;
                            bImm = c.b;
                        }
                    }
                }
            }
        }

        StringBuilder ll = new StringBuilder();
        ll.append("; Jasper demo LLVM IR (int64 print)\n");
        ll.append("declare i32 @printf(i8*, ...)\n\n");
        ll.append("@.fmt = private unnamed_addr constant [13 x i8] c\"%ld %ld %ld\\0A\\00\", align 1\n\n");

        if (hasFoo) {
            ll.append("define void @foo(i64 %a, i64 %b) {\n");
            ll.append("entry:\n");
            ll.append("  %sum = add i64 %a, %b\n");
            ll.append("  %fmtp = getelementptr inbounds [13 x i8], [13 x i8]* @.fmt, i64 0, i64 0\n");
            ll.append("  call i32 (i8*, ...) @printf(i8* %fmtp, i64 %a, i64 %b, i64 %sum)\n");
            ll.append("  ret void\n");
            ll.append("}\n\n");
        }

        ll.append("define void @__entry() {\n");
        ll.append("entry:\n");
        if (hasFoo && entryCallsFoo) {
            ll.append("  call void @foo(i64 ").append(aImm).append(", i64 ").append(bImm).append(")\n");
        }
        ll.append("  ret void\n");
        ll.append("}\n\n");

        ll.append("define i32 @main() {\n");
        ll.append("entry:\n");
        ll.append("  call void @__entry()\n");
        ll.append("  ret i32 0\n");
        ll.append("}\n");

        Files.write(llPath, ll.toString().getBytes(StandardCharsets.UTF_8));
    }

    private void compileWithClang(Path llPath, Path outBin) throws IOException, InterruptedException {
        ProcessBuilder pb = new ProcessBuilder(
                "clang",
                llPath.toAbsolutePath().toString(),
                "-O0",
                "-o",
                outBin.toAbsolutePath().toString()
        );
        pb.inheritIO();
        Process p = pb.start();
        int code = p.waitFor();
        if (code != 0) throw new IOException("clang failed with exit code " + code + ". LLVM IR: " + llPath.toAbsolutePath());
        outBin.toFile().setExecutable(true, false);
    }
}
