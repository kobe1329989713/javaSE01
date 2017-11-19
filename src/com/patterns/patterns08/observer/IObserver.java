package com.patterns.patterns08.observer;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/08/19/ 15:39 星期六<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>观察模式
 *
 *
 *  观察者模式，
 *      第一个体系，一个接口两个实现，更新观察者。
 *
 *      第二个体系，增加 删除 通知  观察者 和 自身的操作。
 *
 *
 *
 * <BR>
 */
public interface IObserver {
    void update();
}
