package com.Patterns.patterns08.observer;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/08/19/ 16:05 星期六<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>javaSE01<BR>
 */
public class MySubject extends AbstractSubject {
    @Override
    public void operation() {
        System.out.println("update self!");
        notifyObserver();
    }
}
