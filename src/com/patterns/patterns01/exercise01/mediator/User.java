package com.patterns.patterns01.exercise01.mediator;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/10/04/ 18:11 星期三<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>javaSE01<BR>
 */
public abstract class User {
    private IMediator mediator;

    public IMediator getMediator() {
        return mediator;
    }

    public User(IMediator mediator) {
        this.mediator = mediator;
    }

    public abstract void work();
}
