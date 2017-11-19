package com.patterns.patterns08.command;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/08/19/ 17:33 星期六<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>javaSE01<BR>
 */
public class MyCommandImpl implements ICommand {
    private Receiver receiver;

    public MyCommandImpl(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exe() {
        receiver.action();
    }
}
