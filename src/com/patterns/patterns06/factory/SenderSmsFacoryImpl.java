package com.patterns.patterns06.factory;

/**
 * Created by kobe on 2017/7/21.1:00
 * <br/>
 * Description:
 * 抽象工厂 之 ？？？？
 */
public class SenderSmsFacoryImpl implements Provider{

    @Override
    public Sender productA() {
        return new SmsSender();
    }
}
