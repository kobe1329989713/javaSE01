package com.patterns.patterns01.exercise02.adapter.interfaceAdapter;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/11/12/ 19:47 星期日<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>javaSE01<BR>
 */
public class TestInterfaceAdapter {
    public static void main(String[] args) {
        ISourceable s1 = new SourceImpl01();
        ISourceable s2 = new SourceImpl02();

        s1.method1();
        s1.method2();
        s2.method1();
        s2.method2();
    }
}
