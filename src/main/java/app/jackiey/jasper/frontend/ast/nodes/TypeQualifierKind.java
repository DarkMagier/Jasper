package app.jackiey.jasper.frontend.ast.nodes;

/** 类型后缀限定符：? / ! / ?? */
public enum TypeQualifierKind {
    NULLABLE,
    NON_NULL,
    NULL_COALESCE
}
