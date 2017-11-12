package com.Patterns.patterns01.exercise01.tmplateMethod;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/10/04/ 12:18 星期三<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>
 *
 *  strategy(策略模式) 之模板  方法模式。
 *
 * <BR>
 */
public class StrategyTest {
    public static void main(String[] args) {
        String exp = "8+8";
        AbstractCalculator cal = new Plus();
        int result = cal.calculate(exp, "\\+");
        System.out.println(result);

        String exp1 = "8*8";
        AbstractCalculator cal2 = new Multiply();
        int result2 = cal2.calculate(exp1, "\\*");
        System.out.println(result2);

        String exp2 = "18-8";
        AbstractCalculator cal3 = new Minus();
        int result3 = cal3.calculate(exp2, "\\-");
        System.out.println(result3);
    }
}
