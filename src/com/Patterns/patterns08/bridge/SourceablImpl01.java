package com.Patterns.patterns08.bridge;

/**
 * Created by kobe on 2017/8/17.18:53
 * <br/>
 * Description:
 */
public class SourceablImpl01 implements ISourceable {
    @Override
    public void method() {
        System.out.println("impl 01，===mysql");
    }
}
