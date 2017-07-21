package com.Patterns.patterns06.factory;

/**
 * Created by kobe on 2017/7/20.21:52
 * <br/>
 * Description:
 *  见名知意。
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("邮件发关==this is mailsender!");
    }
}
