package com.patterns.patterns06.factory;

/**
 * Created by kobe on 2017/7/21.0:58
 * <br/>
 * Description:
 * 抽象工厂模式 之 创建 发送 邮件的 工厂
 */
public class SendMailFactoryImpl implements Provider{
    @Override
    public Sender productA() {
        return new  MailSender();
    }
}
