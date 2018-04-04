package cn.maxlu.util;

public class EscapeUtil {
    public static String escape(String source) {
        return StringUtils.isBlank(source) ? source : source.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;").replace("'", "&apos;").replace("<", "&lt;").replace("\"", "&quot;");
    }

    public static String escapeAnd(String source) {
        return StringUtils.isBlank(source) ? source : source.replace("&", "&amp;");
    }
}
