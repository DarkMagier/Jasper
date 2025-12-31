package app.jackiey.jasper.frontend.parse;

import app.jackiey.jasper.frontend.ast.nodes.Program;

public final class ParseResult {
    public final Program program;
    public ParseResult(Program program) {
        this.program = program;
    }
}
