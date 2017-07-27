package com.Patterns.patterns06.adapter.inter;

/**
 * Created by kobe on 2017/7/27.21:22
 * <br/>
 * Description:
 */
public class Wrappter02 implements Sourceable {
    @Override
    public void method01() {
        System.out.println("22");
    }

    @Override
    public void method02() {
        System.out.println(33);
    }
}
