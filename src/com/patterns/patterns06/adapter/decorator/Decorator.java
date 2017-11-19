package com.patterns.patterns06.adapter.decorator;

/**
 * Created by kobe on 2017/7/27.21:33
 * <br/>
 * Description:
 */
public class Decorator implements Sourceable {
    private Sourceable source;

    public Decorator(Sourceable source) {
        this.source = source;
    }

    @Override
    public void method() {
        System.out.println("befor");
        source.method();
        System.out.println("after");
    }
}
