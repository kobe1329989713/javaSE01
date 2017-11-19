package com.patterns.patterns01.exercise01.strategy;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/10/04/ 12:01 星期三<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>
 *
 *      策略模式：把 + - * /  ，定义成函数，要用哪个时直接调用某个函数就好。
 *
 * <BR>
 */
public interface ICalculator {
    int calculator(String exp);
}
