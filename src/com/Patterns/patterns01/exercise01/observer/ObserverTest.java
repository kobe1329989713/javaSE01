package com.Patterns.patterns01.exercise01.observer;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/10/04/ 16:10 星期三<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>javaSE01<BR>
 */
public class ObserverTest {
    public static void main(String[] args) {
        // 我的这个主题
        ISubject sub = new MySubject();
        // 这个人关注了
        sub.add(new ObserverImpl());
        // 这个人也关注了。
        sub.add(new ObserverImpl02());

        // 我的主题更新了。
        sub.operation();
    }
}
