package app.jackiey.jasper.util;

public final class Strings {
    private Strings() {}

    public static String nullToEmpty(String s) {
        return s == null ? "" : s;
    }
}
