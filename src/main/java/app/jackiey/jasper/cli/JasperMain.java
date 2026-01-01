package app.jackiey.jasper.cli;

import app.jackiey.jasper.backend.api.Artifact;
import app.jackiey.jasper.backend.api.Target;
import app.jackiey.jasper.backend.targets.jvm_bytebuddy.ByteBuddyBackend;
import app.jackiey.jasper.backend.targets.native_ll.LlvmBackend;
import app.jackiey.jasper.frontend.diag.Diagnostic;
import app.jackiey.jasper.frontend.diag.DiagnosticSink;
import app.jackiey.jasper.frontend.parse.ParseFacade;
import app.jackiey.jasper.frontend.parse.ParseResult;
import app.jackiey.jasper.middle.checker.AstChecker;
import app.jackiey.jasper.middle.hir.HirProgram;
import app.jackiey.jasper.middle.lowering.AstToHirLowering;
import app.jackiey.jasper.middle.lowering.HirToMirLowering;
import app.jackiey.jasper.middle.mir.MirProgram;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Jasper CLI (demo stage).
 * <p>
 * Pipeline:
 *   source -> AST -> Checker -> HIR -> MIR -> (ByteBuddy | ByteDeco LLVM)
 */
public final class JasperMain {

    public static void main(String[] args) throws Exception {
        CliOptions opt = CliOptions.parse(args);

        DiagnosticSink diag = new DiagnosticSink();
        String source = loadSource(opt);

        ParseResult parsed = new ParseFacade().parse(source, diag);
        if (diag.hasErrors()) {
            printDiagsAndExit(diag);
            return;
        }

        AstChecker.CheckedProgram checked = new AstChecker().check(parsed.program, diag);
        if (diag.hasErrors()) {
            printDiagsAndExit(diag);
            return;
        }

        HirProgram hir = new AstToHirLowering().lower(checked);
        MirProgram mir = new HirToMirLowering().lower(hir);

        Artifact artifact;
        if (opt.target == Target.JVM) {
            ByteBuddyBackend be = new ByteBuddyBackend();
            artifact = be.emit(mir, opt);
            if (opt.run) {
                be.runMain();
            }
        } else {
            LlvmBackend be = new LlvmBackend();
            artifact = be.emit(mir, opt);
            if (opt.run && opt.target == Target.NATIVE) {
                Process p = new ProcessBuilder(artifact.path.toAbsolutePath().toString())
                        .inheritIO()
                        .start();
                int code = p.waitFor();
                System.exit(code);
            }
        }

        if (artifact.path != null) {
            System.out.println("artifact: " + artifact.path.toAbsolutePath());
        }
    }

    private static void printDiagsAndExit(DiagnosticSink diag) {
        for (Diagnostic d : diag.all()) {
            System.err.println(d.renderOneLine());
        }
        System.exit(1);
    }

    private static String loadSource(CliOptions opt) throws Exception {
        if (opt.code != null) return opt.code;
        if (opt.inputFile != null) {
            byte[] bytes = Files.readAllBytes(opt.inputFile);
            return new String(bytes, StandardCharsets.UTF_8);
        }
        // default: read ./foo.jas if present
        Path p = Paths.get("foo.jas");
        if (Files.exists(p) && Files.isRegularFile(p)) {
            byte[] bytes = Files.readAllBytes(p);
            return new String(bytes, StandardCharsets.UTF_8);
        }
        // last-resort fallback
        return "foo()";
    }

    public static final class CliOptions {
        public final Target target;
        public final boolean run;
        public final String code;
        public final Path inputFile;
        public final Path out;

        private CliOptions(Target target, boolean run, String code, Path inputFile, Path out) {
            this.target = target;
            this.run = run;
            this.code = code;
            this.inputFile = inputFile;
            this.out = out;
        }

        public static CliOptions parse(String[] args) {
            Target target = Target.JVM;
            boolean run = false;
            String code = null;
            Path in = null;
            Path out = null;

            for (int i = 0; i < args.length; i++) {
                String a = args[i];
                if ("--target".equals(a) && i + 1 < args.length) {
                    String v = args[++i].trim().toLowerCase();
                    if ("jvm".equals(v)) target = Target.JVM;
                    else if ("ll".equals(v)) target = Target.LL;
                    else if ("native".equals(v)) target = Target.NATIVE;
                    else throw new IllegalArgumentException("Unknown --target: " + v);
                } else if ("--run".equals(a)) {
                    run = true;
                } else if ("--code".equals(a) && i + 1 < args.length) {
                    code = args[++i];
                } else if ("--in".equals(a) && i + 1 < args.length) {
                    in = Paths.get(args[++i]);
                } else if ("--out".equals(a) && i + 1 < args.length) {
                    out = Paths.get(args[++i]);
                } else if ("--help".equals(a) || "-h".equals(a)) {
                    printHelpAndExit();
                } else {
                    throw new IllegalArgumentException("Unknown arg: " + a);
                }
            }
            return new CliOptions(target, run, code, in, out);
        }

        private static void printHelpAndExit() {
            System.out.println("Jasper demo compiler");
            System.out.println("  --in foo.jas             read source file (default: ./foo.jas)");
            System.out.println("  --code \"...\"             inline source");
            System.out.println("  --target jvm|ll|native   output target");
            System.out.println("  --out path               output path (ll/native) (default: target/jasper/...) ");
            System.out.println("  --run                    run the compiled program (jvm/native)");
            System.exit(0);
        }
    }
}
