package com.patterns.patterns11.exersise01;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/08/26/ 18:58 星期六<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>javaSE01<BR>
 */
public class User1 extends User {
    public User1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user1 exe!");
    }
}
