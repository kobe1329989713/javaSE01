package com.patterns.patterns01.exercise02.factory;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/11/12/ 18:02 星期日<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>javaSE01<BR>
 */
public class SendFactory {
    /**
     *  传递字符串的工厂，如果字符串传递错误就不能创建对象，改进如下：
     * @param type 。
     * @return 。
     * @throws SendException 。
     */
    public ISender produce(String type) throws SendException {
        if ("mail".equals(type)) {
            return new MailSenderImpl();
        } else if ("sms".equals(type)) {
            return new SmsSenderImpl();
        } else {
            throw new SendException("not font type");
        }
    }


    // 改进一。
    public ISender produceMail() {
        return new MailSenderImpl();
    }
    public ISender produceSms() {
        return new SmsSenderImpl();
    }


    // 改进二。
    public static ISender produceMail2() {
        return new MailSenderImpl();
    }
    public static ISender produceSms2() {
        return new SmsSenderImpl();
    }

}
