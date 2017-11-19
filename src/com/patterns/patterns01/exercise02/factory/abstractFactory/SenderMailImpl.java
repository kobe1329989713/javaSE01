package com.patterns.patterns01.exercise02.factory.abstractFactory;

import com.patterns.patterns01.exercise02.factory.ISender;
import com.patterns.patterns01.exercise02.factory.MailSenderImpl;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/11/12/ 18:53 星期日<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>javaSE01<BR>
 */
public class SenderMailImpl implements ISenderFactory {
    @Override
    public ISender produce() {
        return new MailSenderImpl();
    }
}
