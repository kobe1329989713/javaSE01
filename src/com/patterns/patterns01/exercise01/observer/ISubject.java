package com.patterns.patterns01.exercise01.observer;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/10/04/ 16:02 星期三<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>javaSE01<BR>
 */
public interface ISubject {

    /*增加观察者*/
    void add(IObserver observer);

    /*删除观察者*/
    void del(IObserver observer);

    /*通知所有的观察者*/
    void nofity();

    /*自身的操作*/
    void operation();
}
