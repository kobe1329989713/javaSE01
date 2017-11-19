package com.patterns.patterns06.adapter.decorator;

/**
 * Created by kobe on 2017/7/27.21:35
 * <br/>
 * Description:
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Sourceable s = new Source();
        Sourceable decorator = new Decorator(s);
        decorator.method();
    }
}
