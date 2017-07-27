package com.Patterns.patterns06.adapter.classes;

/**
 * Created by kobe on 2017/7/27.20:56
 * <br/>
 * Description:
 * 就是让 Targetable 接口有 ，Source 的功能。
 */
public interface Targetable {
    /* 与原类中的方法相同 */
    void method01();

    /* 新类的方法 */
    void method02();

}
