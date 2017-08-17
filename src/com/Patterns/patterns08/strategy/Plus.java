package com.Patterns.patterns08.strategy;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/08/17/ 23:39 星期四<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>javaSE01<BR>
 */
public class Plus extends AbstractCalculator implements ICalculator {
    @Override
    public int calculate(String exp) {
        int arrayInt[] = split(exp, "\\+");
        return arrayInt[0] + arrayInt[1];
    }
}
