package com.Patterns.Patterns02;

/**
 * 测试 也就是 客服端
 */
public class Client {
    // 抽象。
    private static ICreator ICreator01,ICreator02;
    private static IProduct IProduct01,IProduct02;

    public static void main(String[] args) {
        // 调用不同的工厂、创建不同对象。
        ICreator01 = new ConcreateCreator01();
        IProduct01 = ICreator01.factory();
        IProduct01.product01();


        ICreator02 = new ConcreateCreator02();
        IProduct02 = ICreator02.factory();
        IProduct02.product01();
    }


}
