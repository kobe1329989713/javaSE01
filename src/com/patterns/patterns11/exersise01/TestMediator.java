package com.patterns.patterns11.exersise01;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/08/26/ 19:03 星期六<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>javaSE01<BR>
 */
public class TestMediator {
    public static void main(String[] args) {
        Mediator mediator = new MyMediator();
        mediator.createMediator();
        mediator.workAll();
    }
}
