package app.jackiey.jasper.frontend.sema;

import java.util.Objects;

/**
 * Jasper 的最小类型表示（仅用于 v0.0.04 的空安全 + definite assignment 测试）。
 *
 * 约束：
 * - 本阶段不做完整的泛型/成员解析；只关心：
 *   1) baseName
 *   2) nullable（是否允许为 null）
 *   3) pointer（*T：FFI/raw pointer，默认可为 null）
 *   4) typeVar（T：类型参数，默认“可能为 null”，除非 NonNull 约束）
 */
public final class JType {
    public final String baseName;
    public final boolean nullable;
    public final boolean pointer;
    public final boolean typeVar;

    private JType(String baseName, boolean nullable, boolean pointer, boolean typeVar) {
        this.baseName = baseName;
        this.nullable = nullable;
        this.pointer = pointer;
        this.typeVar = typeVar;
    }

    public static JType concrete(String baseName, boolean nullable, boolean pointer) {
        // pointer 默认可为 null（贴近 C 语义）
        boolean effectiveNullable = nullable || pointer;
        return new JType(baseName, effectiveNullable, pointer, false);
    }

    /**
     * 类型参数：nullability 由调用方决定。
     *
     * - unconstrained T：默认允许实例化为 U?，因此在函数体内视为“可能为 null”。
     * - where T is NonNull：则在函数体内可按非空对待。
     */
    public static JType typeVar(String name, boolean nullable) {
        return new JType(name, nullable, false, true);
    }

    public JType withNonNull() {
        if (pointer) {
            // pointer 世界：我们仍然认为可能为 null（除非未来引入更严格的 unsafe）。
            return this;
        }
        return new JType(baseName, false, false, typeVar);
    }

    public boolean isAssignableFrom(JType rhs) {
        // null 赋值规则：
        // - 只有 nullable 才能接受 null
        // - pointer 默认可空，因此也能接受 null
        if (rhs == null) return false;
        if ("<null>".equals(rhs.baseName)) {
            return this.nullable;
        }

        // 本阶段不做复杂的名义/结构兼容，只做最小：同名 or 任意 Any
        if ("Any".equals(this.baseName)) {
            // Any 是顶层类型；nullable 由自身控制
            if (!this.nullable && rhs.nullable) {
                // 不能把可能为 null 的值赋给非空 Any
                return false;
            }
            return true;
        }

        if (!Objects.equals(this.baseName, rhs.baseName)) {
            return false;
        }

        // nullability：不能把 nullable 赋给 non-null
        if (!this.nullable && rhs.nullable) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String s = baseName;
        if (pointer) s = "*" + s;
        if (nullable) s = s + "?";
        return s;
    }
}
