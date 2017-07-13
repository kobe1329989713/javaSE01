package com.javaSE04.Exception.flection03.demo00;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * <br/>Author:Kobe
 * <br/>Date:2017/6/21 23:06
 * <br/>
 * 通过 反射 获取方法相关的信息。
 */
class Class3 extends Class2{
    @Override
    void m6() {

    }
}

abstract class Class2{

    public void m1() {}
    public void m1(int num) {}

    private void m2(){}

    protected void m3(){}
    void m4(){}

    static void m5(){}
    abstract void m6();


    public Class2() {}
    public Class2(int num) {}
}
public class MethodInfo {
    public static void main(String[] args) {
        Class<Class2> c = Class2.class;
        Method[] m1 = c.getMethods();
        for (Method method : m1) {
            /**
             * getMethods() 只能得到 public 的方法
             *
             * 注：还包含它父里面的方法，如：Object 类里方法。
             *  getMethods() 只能得到 public 的方法 和 继承而来的方法，私有private 的方法不能获取到。
             *  受保护的 和 默认 方法 它都不能得到。
             *  静态 和 抽象 的方法 也不能得到
             */
            System.out.println(method.getName());
        }


        System.out.println("===========================");


        Method[] m2 = c.getDeclaredMethods();
        for (Method method : m2) {
            /**
             * getDeclaredMethods()
             *  得到当前这个类所 申明的所有方法，不管什么修饰符的方法，都可以得到。
             *  继承的方法不能
             *  静态 和 抽象 的方法 也能得到
             */
            System.out.println(method.getName());
        }


        System.out.println("=== 根据方法名称 和 它的参数，来得到此方法 ========================");
        /**
         * c.getDeclaredMethod("方法名称"，"方法参数的Class对象"); 重载的
         */
        try {
            Method m3 = c.getDeclaredMethod("m1");
            System.out.println(m3.getName() + "()");

            Method m4 = c.getDeclaredMethod("m1",int.class);
            System.out.println(m4.getName() + "()");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        /**
         *  上面各个类里面还可以得到很多落满。
         *  如：Method 类，还可以得到
         *      1、方法的返回值，
         *      2、方法的参数类型，
         *      3、一及和泛型相关的东东。
         *      4、注解，
         *      5、异常相关的
         *
         *  看文档。
         */



        System.out.println("=== 通过反射获取构造方法 ========================");
        Constructor<?>[] cs = c.getConstructors();
        /**
         *  构造的 方法名字，访问修饰符，构造的参数类型
         */
        for (Constructor<?> constructor : cs) {
            System.out.println(constructor.getName()+"()");
        }



        System.out.println("=======================");
        /**
         *  能得到父类的构造吗？
         *  答：可以。但是必须是 public 的构造方法才行。
         *  父类的构造方法 得不到的。
         */
        //Constructor<?>[] cs3 = Class3.class.getConstructors();
        Constructor<?>[] cs3 = MethodInfo.class.getConstructors();
        for (Constructor<?> constructor : cs3) {
            System.out.println(constructor.getName()+"()");
        }


        System.out.println("=========getDeclaredConstructors() 它就可以得到本类当中所有的构造方法，不管是什么修饰符都可以====================================");
        /**
         * getDeclaredConstructors() 它就可以得到本类当中所有的构造方法，不管是什么修饰符都可以
         * 注：只能得到当前类申明的构造方法。
         */
        Constructor<?>[] cs4 = MethodInfo.class.getDeclaredConstructors();
        for (Constructor<?> constructor : cs4) {
            System.out.println(constructor.getName()+"()");
        }
    }
}
