package com.Patterns.patterns01.exercise02.decorator;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/11/12/ 23:11 星期日<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>其实就是 AOP 原理。<BR>
 */
public class TestDecotator {
    public static void main(String[] args) {
        ISourceable s = new SourcesImpl();
        ISourceable s1 = new Decorator(s);
        s1.method();
    }
}
