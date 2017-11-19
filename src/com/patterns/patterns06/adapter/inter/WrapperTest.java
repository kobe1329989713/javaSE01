package com.patterns.patterns06.adapter.inter;

/**
 * Created by kobe on 2017/7/27.21:24
 * <br/>
 * Description:
 */
public class WrapperTest {
    public static void main(String[] args) {
        Sourceable s1 = new Sub01();
        Sourceable s2 = new Sub02();

        s1.method01();
        s2.method01();

        s1.method02();
        s2.method02();
    }
}
