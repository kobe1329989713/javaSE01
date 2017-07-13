package com.javaSE04.Exception.enum05;

/**
 * <br/>Author:Kobe
 * <br/>Date:2017/6/22 1:45
 * <br/>
 */
public class TestNum {
    public static void main(String[] args) {
        // 不能对枚举进行实例化。
        //Enum1 e1 = new Enum1();
        // 只能把它的 实例赋值给某个变量 才是合法的。

        // 只用这样才是 合法的。
        Enum1 e1 = Enum1.SPRING;

        // 得到枚举所有的实例。
        Enum1[] s = Enum1.values();
        for (Enum1 enum1 : s) {
            // 名字
            System.out.println(enum1.name());
            // 得到序号，从 0 开始
            System.out.println(enum1.ordinal());
        }


        System.out.println("=// 通过一个参数，得到一个 枚举 实例。区分大小定的。=");
        Enum1 e2 = Enum1.valueOf("SUMMER");
        System.out.println(e2.name());
        System.out.println(e2.ordinal());


    }
}
