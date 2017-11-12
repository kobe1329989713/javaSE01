package com.Patterns.patterns01.exercise02.bridge;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/11/12/ 23:37 星期日<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>javaSE01<BR>
 */
public class TestBridge {
    public static void main(String[] args) {
        // 重点：就是桥接哪个实现类而已。？？？？？
        Bridge b = new MyBridge();
        ISourceable b1 = new SourceImpl();
        b.setSource(b1);
        b1.method();

        ISourceable b2 = new SourceImpl01();
        b.setSource(b2);
        b2.method();
    }
}
