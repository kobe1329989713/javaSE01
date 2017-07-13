package com.javaSE04.Exception.flection03.demo01;

/**
 * <br/>Author:Kobe
 * <br/>Date:2017/6/21 23:40
 * <br/>
 */
public class Dog {

    public String name;

    private String name2;

    public Dog() {
        System.out.println("=---Dog() 无参构造方法------");
    }
    public Dog(String name) {
        System.out.println("=---Dog() 有参构造方法------："+ name);
    }

    public void m1() {
        System.out.println("m1");
    }
    public int m2(String s) {
        System.out.println("m2");
        return 1;
    }

}
