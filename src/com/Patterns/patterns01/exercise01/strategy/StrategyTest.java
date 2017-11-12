package com.Patterns.patterns01.exercise01.strategy;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/10/04/ 12:18 星期三<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>
 *
 *  strategy(策略模式)
 *  接口：定义了一个计算的 标准。
 *  抽象类：要计算的 和 什么符号 也传递进去。
 *
 *
 *  策略模式的决定权在用户，系统本身提供不同算法的实现，新增或者删除算法，对各种算法做封装。因此，策略模式多用在算法决策系统中，外部用户只需要决定用哪个算法即可。
 *      根据不同的功能，用户选择调用不再的api 来完成这个功能就好。
 *
 * <BR>
 */
public class StrategyTest {
    public static void main(String[] args) {
        String exp = "2+8";
        ICalculator cal = new Plus();
        int result = cal.calculator(exp);
        System.out.println(result);


        String exp2 = "12-8";
        ICalculator cal2 = new Minus();
        int result2 = cal2.calculator(exp2);
        System.out.println(result2);


        String exp3 = "4*4";
        ICalculator cal3 = new Multiply();
        int result3 = cal3.calculator(exp3);
        System.out.println(result3);
    }
}
