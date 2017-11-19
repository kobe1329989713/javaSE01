package com.patterns.patterns08.observer;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/08/19/ 16:06 星期六<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>javaSE01<BR>
 */
public class ObserverTest {
    public static void main(String[] args) {
        ISubject sub = new MySubject();
        sub.add(new ObserverImpl01());
        sub.add(new ObserverImpl02());

        sub.operation();
    }
}
