package com.patterns.patterns06.adapter.classes;

/**
 * Created by kobe on 2017/7/27.20:57
 * <br/>
 * Description:
 */
public class Adapter extends Source implements Targetable {
    @Override
    public void method02() {
        System.out.println("this is the targetable method!===这是定位的方法！");
    }
}
