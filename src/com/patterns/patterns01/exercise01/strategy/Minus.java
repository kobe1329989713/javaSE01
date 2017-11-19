package com.patterns.patterns01.exercise01.strategy;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/10/04/ 12:14 星期三<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>javaSE01<BR>
 */
public class Minus extends AbstractCalculator implements ICalculator {
    @Override
    public int calculator(String exp) {
        int arrayInt[] = split(exp, "\\-");
        return arrayInt[0] - arrayInt[1];
    }

}
