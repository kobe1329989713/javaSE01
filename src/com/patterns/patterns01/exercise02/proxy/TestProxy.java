package com.patterns.patterns01.exercise02.proxy;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/11/12/ 23:20 星期日<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>代理 也很像 aop<BR>
 */
public class TestProxy {
    public static void main(String[] args) {
        ISourceable s = new Proxy();
        s.method();
    }
}
