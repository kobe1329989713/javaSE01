package com.javaSE.big;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 * 对 长整弄 的运算。888
 */
public class BigDemo01 {
    public static void main(String[] args) {
        //Long l = 123456789101112131415161718192021222324L;
        BigDecimal d1 = new BigDecimal("123456789101112131415161718192021222324");
        BigDecimal d3 = new BigDecimal("1234567891011121314151617181922324");
        // 两个 BigDecimal 相加。
        System.out.println(d1.add(d3));
        // 相减。
        System.out.println(d1.subtract(d3));
        // *
        System.out.println(d1.multiply(d3));
        // /
        System.out.println(d1.divide(d3,d1.scale()));

        System.out.println(d1.doubleValue());
        System.out.println(d1.toString());
        System.out.println(d1.toPlainString());

                                                    // 可以
        BigDecimal d2 = new BigDecimal("12.34",new MathContext(3, RoundingMode.HALF_UP));
        System.out.println(d2.toPlainString());

        System.out.println("-----------------------------------------------");


        // BigInteger 使用。
        BigInteger i1 = new BigInteger("3254352345325");
        BigInteger i2 = new BigInteger("32543523425");
        // + - * /
        System.out.println(i1.add(i2));
        // 剩下和 BigDecimal 用法差不多。








        //                                                                  这个常理值 代表 四舍五入的 一个落满。看看每一个常量代表什么。
        BigDecimal d4 = new BigDecimal("5.5",new MathContext(1,RoundingMode.UP));
        System.out.println(d4);




    }
}
