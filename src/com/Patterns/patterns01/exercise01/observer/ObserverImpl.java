package com.Patterns.patterns01.exercise01.observer;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/10/04/ 16:00 星期三<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>javaSE01<BR>
 */
public class ObserverImpl implements IObserver {
    @Override
    public void update() {
        System.out.println("observer1 has received!");
    }
}
