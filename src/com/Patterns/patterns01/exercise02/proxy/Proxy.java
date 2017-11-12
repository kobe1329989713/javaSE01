package com.Patterns.patterns01.exercise02.proxy;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/11/12/ 23:19 星期日<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>javaSE01<BR>
 */
public class Proxy implements ISourceable {
    private ISourceable source;

    public Proxy() {
        this.source = new SourceImpl();
    }

    @Override
    public void method() {
        befor();
        source.method();
        after();
    }

    private void after() {
        System.out.println("==after==");
    }

    private void befor() {
        System.out.println("==befor==");
    }
}
