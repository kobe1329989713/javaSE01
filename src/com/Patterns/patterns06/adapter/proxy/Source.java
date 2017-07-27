package com.Patterns.patterns06.adapter.proxy;

/**
 * Created by kobe on 2017/7/27.21:41
 * <br/>
 * Description:
 */
public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("sourceable 01");
    }
}
