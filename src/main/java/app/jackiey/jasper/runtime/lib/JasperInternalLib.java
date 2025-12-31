package app.jackiey.jasper.runtime.lib;

import java.lang.reflect.Method;

public final class JasperInternalLib {
    private JasperInternalLib() {}

    public static void print(String s) {
        System.out.println(s);
    }

    // 目标：print(a,b,a+b)
    public static void printFoo(long a, long b) {
        long c = a + b;
        System.out.println(a + " " + b + " " + c);
    }

    // 反射调用：0 参数
    public static void callGeneratedStatic(String className, String methodName) {
        try {
            Class<?> c = Class.forName(className);
            Method m = c.getMethod(methodName);
            m.invoke(null);
        } catch (Throwable t) {
            throw new RuntimeException("Failed to call " + className + "." + methodName + "()", t);
        }
    }

    // 反射调用：2 个 long 参数
    public static void callGeneratedStatic2Long(String className, String methodName, long a, long b) {
        try {
            Class<?> c = Class.forName(className);
            Method m = c.getMethod(methodName, long.class, long.class);
            m.invoke(null, a, b);
        } catch (Throwable t) {
            throw new RuntimeException("Failed to call " + className + "." + methodName + "(long,long)", t);
        }
    }
}
