package com.Patterns.patterns08.strategy;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/08/17/ 23:31 星期四<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>模块名称：</B>javaSE01<BR>
 * <B>中文类名：</B>javaSE01<BR>
 * <B>概要说明：</B>策略模式，一个接口，把一个算法，分几个不同
 * 实现的,像计算机样。
 *
 *
 * <BR>
 */
public interface ICalculator {
    public int calculate(String exp);
}
