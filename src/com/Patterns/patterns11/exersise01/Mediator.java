package com.Patterns.patterns11.exersise01;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/08/26/ 18:55 星期六<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>
 *      中介者模式
 *      中介者模式也是用来降低类类之间的耦合的
 *      这有点像spring容器的作用
 * <BR>
 */
public interface Mediator {
    void createMediator();

    void workAll();
}
