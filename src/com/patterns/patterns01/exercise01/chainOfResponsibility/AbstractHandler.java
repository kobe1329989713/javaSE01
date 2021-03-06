package com.patterns.patterns01.exercise01.chainOfResponsibility;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/10/04/ 16:56 星期三<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>javaSE01<BR>
 */
public class AbstractHandler {

    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
