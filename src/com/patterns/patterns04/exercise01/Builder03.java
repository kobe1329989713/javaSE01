package com.patterns.patterns04.exercise01;

import java.util.ArrayList;
import java.util.List;

/**
 * <br/> author：Kobe
 * <br/> date：2017/6/16 0016
 * <br/> time：12:04
 * <br/> now：星期五
 * <br/> description：<br/>
 *
 * 建造者模式：
 *      一次创建 N 个对象，
 *
 *   1、一个产品体系。
 *   2、一个，一次创建 N 个对象。
 */

// 产品体系。
interface Sender {
    public void Send();
}
class MailSender implements Sender {
    @Override
    public void Send() {
        System.out.println("product111111");
    }
}

class SmsSender implements Sender {

    @Override
    public void Send() {
        System.out.println("product222222222");
    }
}
// end

// 一次创建 N 个对象
public class Builder03 {

    private List<Sender> list = new ArrayList<>();

    public void ProduceMainlSender(int count){
        for (int i=0; i<count; i++) {
            list.add(new MailSender());
        }
    }

    public void ProduceSmsSender(int count) {
        for (int i=0; i<count; i++) {
            list.add(new SmsSender());
        }
    }
}

// Test
class Test1 {
    public static void main(String[] args) {
        Builder03 builder = new Builder03();
        builder.ProduceMainlSender(4);

        // 获取哪个list 来，得到多个对象。
    }
}