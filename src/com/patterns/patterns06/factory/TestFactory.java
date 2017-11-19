package com.patterns.patterns06.factory;

/**
 * Created by kobe on 2017/7/20.21:58
 * <br/>
 * Description:
 */
public class TestFactory {
    public static void main(String[] args) {
        // 用的是工厂，用它里面的对象来
//        SendFactory factory = new SendFactory();

        // 第一个产品
        // 工厂开始创建对象，并用产品的顶级来接收，多态？？
//        Sender sender = null;
//        try {
//            sender = factory.produce("mail");
//            sender.send();
//        } catch (MyException e) {
//            e.printStackTrace();
//        }

        // 第二个产品。
//        try {
//            Sender sender1 = factory.produce("sms");
//            sender1.send();
//        } catch (MyException e) {
//            e.printStackTrace();
//        }
        // 如果传递的是一个没有的，就抛出来一个异常，工厂方法模式 和 静态工厂模式，也是可以加的
//        try {
//            Sender sender2 = factory.produce("not font");
//            sender2.send();
//        } catch (MyException e) {
//            e.printStackTrace();
//        }
//        System.out.println("这名可以打印反？");


//        多个工厂方法模式，的测试。
//        SendFactory factory = new SendFactory();
//        Sender sender = factory.productMail();
//        sender.send();
//        Sender sender1 = factory.productSms();
//        sender1.send();




//        静态工厂方法模式
//        Sender sender = SendFactory.productMail1();
//        sender.send();
//        Sender sender1 = SendFactory.productSms1();
//        sender1.send();


        /**
         * 工厂模式 应用场景：
         *   1、凡是出现了大量的产品需要创建，并且具有共同的接口时。
         *
         * 一般工厂模式，使用第三种，静态工厂模式。
         *
         * 以上的三种工厂模式有一个问题。
         *     类的必须要创建依赖于工厂类。就是如果你新一个产品的话
         *     必须要去修改工厂类，这个违背了 对扩展开放，对修改关闭原则。
         *
         * 所以就有了，抽象工厂模式。
         *      工厂也必须抽象一个出来，以后新增加一个产品时，就必须对象的增加一个工厂来创建这个新产品的对象。
         */
        // 工厂模式 测试。
        // 先抽象工厂创建一个产品。多态。
        Provider provider = new SendMailFactoryImpl();
        Sender sender = provider.productA();
        sender.send();
        // 第二个产品。
        Provider provider1 = new SenderSmsFacoryImpl();
        Sender sender1 = provider1.productA();
        sender1.send();
        // 这就是依赖于抽象。就是要用它们的父类来接收。？？

// 先工厂把实例创建出来在说。？？？

    }
}
