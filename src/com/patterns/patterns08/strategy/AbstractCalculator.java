package com.patterns.patterns08.strategy;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/08/17/ 23:35 星期四<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>javaSE01<BR>
 */
@SuppressWarnings("ALL")
public abstract class AbstractCalculator {
    public int[] split(String exp, String opt) {
        String array[] = exp.split(opt);
        int arrayInt[] = new int[2];
        arrayInt[0] = Integer.parseInt(array[0]);
        arrayInt[1] = Integer.parseInt(array[1]);
        return arrayInt;
    }
}
