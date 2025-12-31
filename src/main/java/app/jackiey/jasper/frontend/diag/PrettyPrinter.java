package app.jackiey.jasper.frontend.diag;

public final class PrettyPrinter {
    private PrettyPrinter() {}

    public static String quote(String s) {
        if (s == null) return "null";
        return "\"" + s.replace("\\", "\\\\").replace("\"", "\\\"") + "\"";
    }
}
