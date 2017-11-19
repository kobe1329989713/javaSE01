package com.patterns.patterns06.adapter.proxy;

/**
 * Created by kobe on 2017/7/27.21:44
 * <br/>
 * Description:
 */
public class ProxyTest {
    public static void main(String[] args) {
        Sourceable sa = new Proxy();
        sa.method();
    }
}
