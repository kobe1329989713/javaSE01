package com.patterns.patterns09.exersise01;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/08/26/ 18:18 星期六<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>状态模式，就是你QQ 隐藏时，你的好友看到的
 * 状态，你在线时，你好友看见的状态。<BR>
 */
public class State {
    private String value;

    public void method1() {
        System.out.println("execute the first opt!====执行第一个选择！");
    }
    public void method2() {
        System.out.println("execute the first opt!====执行第二个选择！");
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
