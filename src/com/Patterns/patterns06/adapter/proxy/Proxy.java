package com.Patterns.patterns06.adapter.proxy;

/**
 * Created by kobe on 2017/7/27.21:42
 * <br/>
 * Description:
 */
public class Proxy implements Sourceable{
    private Source source;

    public Proxy() {
        this.source = new Source();
    }

    @Override
    public void method() {
        befor();
        source.method();
        after();
    }

    private void after() {
        System.out.println("after");
    }

    private void befor() {
        System.out.println("befor");
    }
}
