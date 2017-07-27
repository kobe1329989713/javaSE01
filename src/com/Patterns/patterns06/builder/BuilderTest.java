package com.Patterns.patterns06.builder;

/**
 * Created by kobe on 2017/7/27.20:42
 * <br/>
 * Description:
 * 建造模式 测试。
 */
public class BuilderTest {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.productMailSender(10);
    }
}
