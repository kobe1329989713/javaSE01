package com.Patterns.patterns01.exercise02.factory.builder;

import com.Patterns.patterns01.exercise02.factory.ISender;
import com.Patterns.patterns01.exercise02.factory.MailSenderImpl;
import com.Patterns.patterns01.exercise02.factory.SmsSenderImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/11/12/ 19:00 星期日<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>
 *      建造者模式，就是一个类  一次创建N多个对象出来。
 * <BR>
 */
public class Builder {
    private List<ISender> list = new ArrayList<>();

    public void produceMailSender(Integer count) {
        for (int i = 0; i < count; i++) {
            list.add(new MailSenderImpl());
        }
    }

    public void produceSmsSender(Integer count) {
        for (int i = 0; i < count; i++) {
            list.add(new SmsSenderImpl());
        }
    }


    public List<ISender> getList() {
        return list;
    }

    public void setList(List<ISender> list) {
        this.list = list;
    }
}
