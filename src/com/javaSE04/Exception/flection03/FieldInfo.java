package com.javaSE04.Exception.flection03;

import java.lang.reflect.Field;

/**
 * <br/>Author:Kobe
 * <br/>Date:2017/6/21 2:40
 * <br/>
 * 反射获取属性。
 */

interface Interface01 {
    int NUM = 10;
}

class Class1 {
    int num1;
    public String name;
}

class MyClass extends Class1 implements Interface01 {
    int num2;
    public int num3;
    public int num4;
}

public class FieldInfo {
    public static void main(String[] args) {
        /**
         *  反射获取属性。
         */
        Class<MyClass> c = MyClass.class;
        Field[] field1 = c.getFields(); // getFields() 是得到所有 public 的属性。
        for (Field field : field1) {
            System.out.println(field.getName());
        }

        System.out.println("================================");

        // getDeclaredFields() 得到所有申明式的属性。
        // 只会 得到 这个类自己的属性，不管什么修饰符它都可以得到
        Field[] field2 = c.getDeclaredFields();
        for (Field field : field2) {
            System.out.println(field.getName());
        }


        System.out.println("================================");
        try {
            // 根据参数名，得到 某个属性
            Field f1 = c.getField("num3");
            System.out.println(f1);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }


        System.out.println("================================");
        try {
            // 根据参数名，得到 申明式的某个属性
            Field f2 = c.getDeclaredField("num2");
            System.out.println(f2);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }


        /**
         * 还可以继续 得到 这个属性的 类型是什么？？
         * 还可以得到这个属性访问修饰符是什么？？
         * 就在这个 Field 类，里面的哪个方法里。33
         */


    }
}
