package com.javaSE04.Exception.flection03.demo00;

import java.io.Serializable;
import java.lang.reflect.Modifier;

/**
 * <br/>Author:Kobe
 * <br/>Date:2017/6/21 2:14
 * <br/>
 *  见名知意。
 *      2、获取 类 处信息。
 *  反射还可以获取，这个 类，继承 哪个类，实现 哪个 接口 这些信息。
 */

abstract class Person extends Thread implements Serializable{

    private static final long serialVersionUID = 3492579504236453214L;
}

public class ClassInfo03 {
    public static void main(String[] args) {
        //2、获取 类 的信息。
        Class<Person> c = Person.class;
        // 全路径。
        System.out.println("得到类的名字：" + c.getName());
        // 只有类名
        System.out.println("得到类的一个简单名字：" + c.getSimpleName());
        System.out.println("得到类所在的包名：" + c.getPackage().getName());
        System.out.println("判断这个类是否是一个基本数据类型：" + c.isPrimitive());
        // 反射还可以判断 它是不是isXxx()一个，注解、枚举、内部类
        System.out.println("判断是否 是一个接口：" + c.isPrimitive());
        System.out.println("==================================");

        // 反射得到它的父类
        Class<?> sc = c.getSuperclass();
        System.out.println(sc.getName());

        // 反射得到它实现哪些接口。
        Class<?>[] si = c.getInterfaces();
        for (Class<?> aClass1 : si) {
            System.out.println(aClass1.getName());
        }
        System.out.println("==================================");

        // 反射还可以得到 访问修饰符
        //int mod = c.getModifiers();
        //System.out.println(Modifier.toString(mod));

        //int mod = Integer.class.getModifiers();
        //System.out.println(Modifier.toString(mod));

        int mod = Serializable.class.getModifiers();
        System.out.println(Modifier.toString(mod));

        // jdk8 提供的一个方法，得到 【访问修饰符 + 全路径的 一个玩意】。
        System.out.println(c.toGenericString());
    }
}
