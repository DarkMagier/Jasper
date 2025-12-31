package app.jackiey.jasper.cli;

import app.jackiey.jasper.frontend.diag.Diagnostic;
import app.jackiey.jasper.frontend.diag.DiagnosticSink;
import app.jackiey.jasper.frontend.parse.ParseFacade;
import app.jackiey.jasper.frontend.parse.ParseResult;
import app.jackiey.jasper.backend.api.Artifact;
import app.jackiey.jasper.backend.api.Target;
import app.jackiey.jasper.backend.cgir.CgProgram;
import app.jackiey.jasper.backend.lower.AstToCgir;
import app.jackiey.jasper.backend.targets.jvm_bytebuddy.ByteBuddyBackend;
import app.jackiey.jasper.backend.targets.native_ll.LlvmTextBackend;
import app.jackiey.jasper.middle.passes.PassManager;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Minimal CLI that compiles a tiny Jasper program from foo.jas (default).
 *
 * Future growth:
 * - Replace ParseFacade implementation with ANTLR wrapper.
 * - Add AST->HIR->MIR passes in PassManager.
 * - Add more backends under backend/targets.
 */
public final class JasperMain {

    public static void main(String[] args) throws Exception {
        CliOptions opt = CliOptions.parse(args);

        DiagnosticSink diag = new DiagnosticSink();
        String source = loadSource(opt);

        ParseResult parsed = new ParseFacade().parse(source, diag);
        if (diag.hasErrors()) {
            for (Diagnostic d : diag.all()) System.err.println(d.renderOneLine());
            System.exit(1);
            return;
        }

        // Pipeline placeholder: today AST -> CGIR directly (kept in PassManager for future extension).
        PassManager pm = new PassManager();
        // In the future: pm.add(new AstToHirPass()); pm.add(new HirToMirPass()); ...

        // Shared lowering: AST -> CGIR (both JVM and LLVM backends use it)
        CgProgram cg = new AstToCgir().lower(parsed.program, diag);
        if (diag.hasErrors()) {
            for (Diagnostic d : diag.all()) System.err.println(d.renderOneLine());
            System.exit(1);
            return;
        }

        Target target = opt.target;
        Artifact artifact;
        switch (target) {
            case JVM:
                artifact = new ByteBuddyBackend().emit(cg, opt);
                break;
            case LL:
            case NATIVE:
                artifact = new LlvmTextBackend().emit(cg, opt);
                break;
            default:
                throw new IllegalStateException("Unknown target: " + target);
        }

        if (artifact.path != null) {
            System.out.println("artifact: " + artifact.path.toAbsolutePath());
        }

        if (opt.run && target == Target.JVM) {
            ((ByteBuddyBackend) artifact.backend).runMain();
        } else if (opt.run && target == Target.NATIVE) {
            if (artifact.path == null) {
                System.err.println("No native artifact produced.");
                System.exit(2);
            }
            Process p = new ProcessBuilder(artifact.path.toAbsolutePath().toString())
                    .inheritIO()
                    .start();
            int code = p.waitFor();
            System.exit(code);
        }
    }

    private static String loadSource(CliOptions opt) throws Exception {
        if (opt.code != null) {
            return opt.code;
        }
        if (opt.inputFile != null) {
            byte[] bytes = Files.readAllBytes(opt.inputFile);
            return new String(bytes, StandardCharsets.UTF_8);
        }
        // Default: read ./foo.jas if present, otherwise fallback demo program.
        Path defaultFile = Paths.get("foo.jas");
        if (Files.exists(defaultFile) && Files.isRegularFile(defaultFile)) {
            byte[] bytes = Files.readAllBytes(defaultFile);
            return new String(bytes, StandardCharsets.UTF_8);
        }
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
            System.out.println("Jasper demo compiler (minimal)");
            System.out.println("  --code \"foo()\"          inline source");
            System.out.println("  --in path/to/file        read source from file");
            System.out.println("  --target jvm|ll|native   output target (default: jvm)");
            System.out.println("  --out path               output path (ll/native) (default: target/jasper/...)");
            System.out.println("  --run                    run the compiled program (jvm/native)");
            System.out.println();
            System.out.println("Default input: reads ./foo.jas if it exists; otherwise uses \"foo()\".");
            System.out.println("Supported syntax (stub): foo() | fn foo() { } foo()");
            System.exit(0);
        }
    }
}
