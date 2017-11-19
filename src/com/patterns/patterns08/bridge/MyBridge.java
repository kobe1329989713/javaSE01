package com.patterns.patterns08.bridge;

/**
 * Created by kobe on 2017/8/17.18:58
 * <br/>
 * Description:
 */
public class MyBridge extends Bridge {
    public void method() {
        getSource().method();
    }
}
