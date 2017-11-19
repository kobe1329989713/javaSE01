package com.patterns.patterns01.exercise02.factory;

import com.patterns.patterns01.exercise02.factory.builder.Builder;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/11/12/ 18:15 星期日<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>
 *      凡是需要大量创建对象的，就可以用工厂模式。
 * <BR>
 */
public class TestFactory {
    public static void main(String[] args) {
//        SendFactory factory = new SendFactory();
//        try {
//            ISender iSender = factory.produce("mail");
//            ISender iSender2 = factory.produce("sms");
//            iSender.send();
//            iSender2.send();
//        } catch (SendException e) {
//            e.printStackTrace();
//        }
//
//
//        System.out.println("==// 测试二。===");
//        ISender iSender = factory.produceMail();
//        ISender iSender1 = factory.produceSms();
//        iSender.send();
//        iSender1.send();
//
//
//        System.out.println("==// 测试三。===");
//        ISender senderMail = SendFactory.produceMail2();
//        ISender senderSms = SendFactory.produceSms2();
//        senderMail.send();
//        senderSms.send();
//
//
//
//        System.out.println("==// 测试四。===");
//        ISenderFactory mail = new SenderMailImpl();
//        ISender senderMail3 = mail.produce();
//        senderMail3.send();
//        ISenderFactory sms = new SenderSmsImpl();
//        ISender senderSms3 = sms.produce();
//        senderSms3.send();


        System.out.println("===建造者模式===");
        Builder b = new Builder();
        b.produceMailSender(10);
        for (ISender mail : b.getList()) {
            mail.send();
        }

        Builder b2 = new Builder();
        b2.produceSmsSender(7);
        for (ISender sms : b2.getList()) {
            sms.send();
        }

    }
}
