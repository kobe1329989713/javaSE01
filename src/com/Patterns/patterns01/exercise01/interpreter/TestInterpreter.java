package com.Patterns.patterns01.exercise01.interpreter;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/10/04/ 18:24 星期三<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>javaSE01<BR>
 */
public class TestInterpreter {
    public static void main(String[] args) {
        // 计算 9+2-8 的值。 这个才叫 函数式编程。
        int result = new Minus().interpreter((new Context(new Plus().interpreter(new Context(9, 2)), 8)));
        System.out.println(result);
    }
}
