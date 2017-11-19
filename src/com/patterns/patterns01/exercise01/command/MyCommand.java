package com.patterns.patterns01.exercise01.command;


/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/10/04/ 17:12 星期三<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>javaSE01<BR>
 */
public class MyCommand implements Command {

    private Receiver receiver;

    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exe() {
        receiver.action();
    }
}
