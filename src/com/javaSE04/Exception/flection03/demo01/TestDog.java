package com.javaSE04.Exception.flection03.demo01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * <br/>Author:Kobe
 * <br/>Date:2017/6/21 23:40
 * <br/>
 * 通过反射 创建 对象，
 *  并 调用 其 属性 和方法。
 */
public class TestDog {
    public static void main(String[] args) {
        //Dog dog = new Dog();

        Class<Dog> c = Dog.class;
        try {
            /**
             * newInstance() 方法就是创建一个新的对象。
             * 它默认就是去调用无参构造方法的。
              */
            Dog dog = c.newInstance();
            // 就是 常规的操作。
        } catch (InstantiationException | IllegalAccessException e) {
            // InstantiationException 实例化异常。如果没有默认构造方法时 会出现
            // IllegalAccessException 非法访问异常，看异常 也是见名知意。如果构造是私有会再现。
            e.printStackTrace();


        }

        // 通过反射的构造来创建对象。
        Constructor constructor = null;
        try {
            constructor = c.getConstructor(String.class);
            // 这里就可以根据构造方法的参数来传值，因为它是动态参数的。
            Dog d = (Dog) constructor.newInstance("kobe");

            // 常规的操作。如：调用方法。
            // 注：通过反射调用方法，第一步是先，获取到这个方法。如下：
            Method m = c.getDeclaredMethod("m1");
            // 在开始调用。如下：
            //m.invoke("传个实例进去"，"得到的哪个方法"，"方法的参数"); 没有可以不伟。注：还有返回值的问题。
            System.out.println(m.invoke(d));


            // 反射调用 有 参数的方法。，
            Method m2 = c.getDeclaredMethod("m2", String.class);
            //                  "传个实例进去"，"得到的哪个方法"，"方法的参数"
            int num = (int) m2.invoke(d,"mar");
            System.out.println(num);



            System.out.println("====通过反射访问对象的属性。=======================");
            //Field f = c.getDeclaredField("name");
            Field f = c.getDeclaredField("name2");
            Constructor constructor2 = c.getConstructor(String.class);
            Dog d2 = (Dog) constructor2.newInstance("kobe");
            f.setAccessible(true);
            // 给属性赋值，
            f.set(d2,"反射");

            // 可以根据哪个属性是什么类型的来获取，如：int 就 getInt() 什么，它有很多重载的方法
            System.out.println(f.get(d2));
            // 注：私有和不能这样赋值的。
            // 给私有属性赋值。
            //f.setAccessible(true); 这样下，就能给私有属性赋值了
            // 它可以



        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchFieldException e) {
            e.printStackTrace();
        }


    }
    /**
     * 注：小写 class 与 大写 Class 的不同
     * 框架里面用 Class。forName("类的全路径")
     * 这个方法来做，所以我们在 xx.xml 里面要配置多的全路径了，因为用的是反射里面这个方法
     *
     */
}
