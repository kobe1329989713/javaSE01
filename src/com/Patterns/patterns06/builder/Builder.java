package com.Patterns.patterns06.builder;

import com.Patterns.patterns06.factory.MailSender;
import com.Patterns.patterns06.factory.Sender;
import com.Patterns.patterns06.factory.SmsSender;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kobe on 2017/7/27.20:37
 * <br/>
 * Description:
 * Builder 建造都模式，就是一次创建多个对象
 */
public class Builder {
    private List<Sender> list = new ArrayList<>();

    public void productMailSender(int count) {
        for (int i=0; i<count;i++) {
            list.add(new MailSender());
        }
    }


    public void productSmsSender(int count) {
        for (int i=0; i<count;i++) {
            list.add(new SmsSender());
        }
    }
}
