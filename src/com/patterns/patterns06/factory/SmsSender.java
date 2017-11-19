package com.patterns.patterns06.factory;

/**
 * Created by kobe on 2017/7/20.21:54
 * <br/>
 * Description:
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("这是短信发送者!== this is sms sender!");
    }
}
