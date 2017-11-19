package com.patterns.patterns01.exercise02.adapter.classAdapter;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/11/12/ 19:29 星期日<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>javaSE01<BR>
 */
public class TestAdapter {
    public static void main(String[] args) {
        ITargetable t1 = new Adapter();
        t1.method1();
        t1.method2();
    }
}
