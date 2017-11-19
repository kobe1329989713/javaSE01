package com.patterns.patterns12.exersise01;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/08/26/ 19:11 星期六<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>javaSE01<BR>
 */
public class TestInterpreter {
    public static void main(String[] args) {


        // 计算9+2-8的值
        int result = new Minus().interpret((new Context(new Plus().interpret(new Context(9, 2)), 8)));


        System.out.println(result);



    }
}
