package com.Patterns.patterns06.adapter.decorator;

/**
 * Created by kobe on 2017/7/27.21:32
 * <br/>
 * Description:
 */
public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("sourceable--->source");
    }
}
