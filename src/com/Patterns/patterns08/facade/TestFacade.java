package com.Patterns.patterns08.facade;

/**
 * Created by kobe on 2017/8/17.18:07
 * <br/>
 * Description:
 */
public class TestFacade {
    public static void main(String[] args) {
        Computer c = new Computer();
        c.startup();
        c.shutdown();
    }
}
