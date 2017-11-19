package com.patterns.patterns08.command;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/08/19/ 17:37 星期六<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>javaSE01<BR>
 */
public class Invoker {
    private ICommand command;

    public Invoker(ICommand command) {
        this.command = command;
    }

    public void action() {
        command.exe();
    }
}
