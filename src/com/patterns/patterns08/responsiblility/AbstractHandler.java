package com.patterns.patterns08.responsiblility;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/08/19/ 17:17 星期六<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>javaSE01<BR>
 */
public abstract class AbstractHandler {
    private IHandler handler;

    public IHandler getHandler() {
        return handler;
    }

    public void setHandler(IHandler handler) {
        this.handler = handler;
    }
}
