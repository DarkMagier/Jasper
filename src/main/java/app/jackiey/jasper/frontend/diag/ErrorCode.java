package app.jackiey.jasper.frontend.diag;

public enum ErrorCode {
    PARSE_ERROR,
    UNSUPPORTED_SYNTAX,
    INTERNAL_ERROR,

    // --- v0.0.04：类型/空安全/控制流检查 ---
    NULLABILITY_MISMATCH,
    READ_BEFORE_ASSIGN,
    CONST_REQUIRES_INITIALIZER,
    CANNOT_INFER_TYPE_FROM_NULL,
    INVALID_WHERE_CONSTRAINT
}
