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
 * Today's goal native backend:
 * - emits LLVM IR using printf:
 *   foo(i64 a, i64 b) prints: a b a+b
 * - main calls __entry which calls foo(imm,imm)
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
        // Find entry call constants
        long aImm = 1, bImm = 2;
        for (CgFunction fn : cg.functions) {
            if (AstToCgir.ENTRY.equals(fn.name)) {
                for (CgInst inst : fn.body) {
                    if (inst instanceof CgInst.Call2I64) {
                        CgInst.Call2I64 c = (CgInst.Call2I64) inst;
                        aImm = c.a; bImm = c.b;
                    }
                }
            }
        }

        // LLVM IR (text)
        // declare i32 @printf(i8*, ...)
        // foo: add and printf("%ld %ld %ld\n", a, b, a+b)
        String ll =
                "; Jasper demo LLVM IR (int64 print)\n" +
                        "declare i32 @printf(i8*, ...)\n\n" +
                        "@.fmt = private unnamed_addr constant [13 x i8] c\"%ld %ld %ld\\0A\\00\", align 1\n\n" +

                        "define void @foo(i64 %a, i64 %b) {\n" +
                        "entry:\n" +
                        "  %sum = add i64 %a, %b\n" +
                        "  %fmtp = getelementptr inbounds [13 x i8], [13 x i8]* @.fmt, i64 0, i64 0\n" +
                        "  call i32 (i8*, ...) @printf(i8* %fmtp, i64 %a, i64 %b, i64 %sum)\n" +
                        "  ret void\n" +
                        "}\n\n" +

                        "define void @__entry() {\n" +
                        "entry:\n" +
                        "  call void @foo(i64 " + aImm + ", i64 " + bImm + ")\n" +
                        "  ret void\n" +
                        "}\n\n" +

                        "define i32 @main() {\n" +
                        "entry:\n" +
                        "  call void @__entry()\n" +
                        "  ret i32 0\n" +
                        "}\n";

        Files.write(llPath, ll.getBytes(StandardCharsets.UTF_8));
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
