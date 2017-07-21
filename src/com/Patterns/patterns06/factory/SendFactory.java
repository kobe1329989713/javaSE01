package com.Patterns.patterns06.factory;

/**
 * Created by kobe on 2017/7/20.21:55
 * <br/>
 * Description:
 * 简单工厂。
 */
public class SendFactory {
    public Sender produce(String type) throws MyException {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
//            System.out.println("这里可以自定义一个异常，抛出去。如下：");
//            return null;
            throw new MyException("无效参数");
        }
    }

    /**
     * 多个工厂方法模式，
     * 就是不传递参数，直接一个工厂方法创建一个 对象出来。
     * 如下。
     */
    public Sender productMail() {
        return new MailSender();
    }

    public Sender productSms() {
        return new SmsSender();
    }

    /**
     * 静态工厂方法模式
     * 将上面的多个工厂方法模式里的方法置为静态的，不需要创建实例，直接调用即可。
     */
    public static Sender productMail1() {
        return new MailSender();
    }

    public static Sender productSms1() {
        return new SmsSender();
    }

}
