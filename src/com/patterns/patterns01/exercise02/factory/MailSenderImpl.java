package com.patterns.patterns01.exercise02.factory;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/11/12/ 18:01 星期日<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>javaSE01<BR>
 */
public class MailSenderImpl implements ISender {
    @Override
    public void send() {
        System.out.println("发送邮件。");
    }
}
