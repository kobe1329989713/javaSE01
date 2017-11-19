package com.patterns.patterns04.exercise01;

/**
 * <br/> author：Kobe
 * <br/> date：2017/6/16 0016
 * <br/> time：11:45
 * <br/> now：星期五
 * <br/> description：<br/>
 *  单例类
 *      1、知道如何实现它。
 *      2、三大步
 */
public class Sengleton02 {
    /*
        1、
        持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载
     */
    private static Sengleton02 instance = null;

    /*  2、
    私有构造方法，防止被实例化 */
    private Sengleton02() {}

    /*  3、
    静态工程方法，创建实例 */
    public static Sengleton02 getInstance(){
        if(instance == null){
            instance = new Sengleton02();
        }
        return instance;
    }
    // 如果是多线程环境，可以用下面方法。
//    public static synchronized Sengleton02 getInstance() {
//        if (instance == null) {
//            instance = new Sengleton02();
//        }
//        return instance;
//    }
    // 还可以如此
//    public static Sengleton02 getInstance() {
//        if (instance == null) {
//            synchronized (instance) {
//                if (instance == null) {
//                    instance = new Sengleton02();
//                }
//            }
//        }
//        return instance;
//    }



    /*  4、
    如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve() {
        return instance;
    }
}


// 注：最好用下面这种
class Singleton {

    /* 私有构造方法，防止被实例化 */
    private Singleton() {
    }

    /* 此处使用一个内部类来维护单例 */
    private static class SingletonFactory {
        private static Singleton instance = new Singleton();
    }

    /* 获取实例 */
    public static Singleton getInstance() {
        return SingletonFactory.instance;
    }

    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve() {
        return getInstance();
    }
}

// 222
class SingletonTest {

    private static SingletonTest instance = null;

    private SingletonTest() {
    }

    private static synchronized void syncInit() {
        if (instance == null) {
            instance = new SingletonTest();
        }
    }

    public static SingletonTest getInstance() {
        if (instance == null) {
            syncInit();
        }
        return instance;
    }
}

// 333
//class SingletonTest {
//
//    private static SingletonTest instance = null;
//    private Vector properties = null;
//
//    public Vector getProperties() {
//        return properties;
//    }
//
//    private SingletonTest() {
//    }
//
//    private static synchronized void syncInit() {
//        if (instance == null) {
//            instance = new SingletonTest();
//        }
//    }
//
//    public static SingletonTest getInstance() {
//        if (instance == null) {
//            syncInit();
//        }
//        return instance;
//    }
//
//    public void updateProperties() {
//        SingletonTest shadow = new SingletonTest();
//        properties = shadow.getProperties();
//    }
//}

