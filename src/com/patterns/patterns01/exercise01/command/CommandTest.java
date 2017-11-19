package com.patterns.patterns01.exercise01.command;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/10/04/ 17:16 星期三<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>
 *
 *  传过去，传过来，调用的还是它。但是这样 转移一下，就可以解耦
 *
 *   发出者和执行者之间解耦，实现请求和执行分开
 *
 * <BR>
 */
public class CommandTest {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command cmd = new MyCommand(receiver);
        Invoker invoker = new Invoker(cmd);
        invoker.action();
    }
}
