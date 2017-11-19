package com.patterns.patterns08.observer;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/08/19/ 15:42 星期六<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>javaSE01<BR>
 */
public class ObserverImpl02 implements IObserver {
    @Override
    public void update() {
        System.out.println("observer2 has received!");
    }
}
