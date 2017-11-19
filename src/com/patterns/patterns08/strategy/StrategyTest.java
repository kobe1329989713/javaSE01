package com.patterns.patterns08.strategy;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/08/17/ 23:45 星期四<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>javaSE01<BR>
 */
public class StrategyTest {
    public static void main(String[] args) {
        String exp = "2+8";
        ICalculator cal = new Plus();
        int result = cal.calculate(exp);
        System.out.println(result);


    }
}
