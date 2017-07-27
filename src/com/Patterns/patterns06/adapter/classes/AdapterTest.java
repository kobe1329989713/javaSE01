package com.Patterns.patterns06.adapter.classes;

/**
 * Created by kobe on 2017/7/27.20:58
 * <br/>
 * Description:
 */
public class AdapterTest {
    public static void main(String[] args) {
        Targetable target = new Adapter();
        target.method01();
        target.method02();
    }
}
