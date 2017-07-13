package com.javaSE04.Exception.flection03.demo00;

/**
 * <br/>Author:Kobe
 * <br/>Date:2017/6/21 1:49
 * <br/>
 * 反射。就是 打点 调用的另一种方式
 * 因为你要用 反射，就必须先得到 它的 一个 Class 对象，
 * <p>
 * 三种得到 Class 对象的介绍。
 */

class User {
    static {
        System.out.println("User init...");
    }
}

public class ReflectionDemo01 {

    static void create1() {
        new User();
    }

    static void create2() {
        Class<User> c = User.class;
    }

    static void create3() {
        try {
            Class c = Class.forName("com.javaSE04.Exception.flection03.demo00.User");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    static void create4() {
        // forName("类的全路径"，"是否初始化"，"类加载器")
        try {
            Class c = Class.forName("com.javaSE04.Exception.flection03.demo00.User",true,ReflectionDemo01.class.getClassLoader());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        //create1();

        //create2();

        //create3();

        create4();

        /**
         * 三种得到 Class 对象的介绍。
         */
        // 得到一个 Class 对象，如：String 类的 Class 对象，如下：
        // 为什么是一个 集合了，因为反射它可以得到 String 类里面的很多东东，所以是集合。基本上 String 类型所以的东东，都可以得到
        //Class<String> c = String.class;

        // 第二种获取 Class 对象的方法，它一般用于 一个 实例来获取 一个Class 对象的。上面哪个是用类来获取Class 对象的。
        //String s = "";
        //Class<?> c1 = s.getClass();


        // 第三种方式：获取 Class 对象。
        // Class.forName();注：它写的是全路径哦，  它两个重载的方法的，
        //try {
        //    Class<?> c2 = Class.forName("java.lang.String");
        //} catch (ClassNotFoundException e) {
        //    e.printStackTrace();
        //}




        // 获取 基本数据类型的 Class 对象。
        System.out.println(int.class == Integer.TYPE);

    }
}
