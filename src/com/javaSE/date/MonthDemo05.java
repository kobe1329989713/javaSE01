package com.javaSE.date;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 */
public class MonthDemo05 {
    public static void main(String[] args) {
        Month m = Month.OCTOBER; // 枚举，它就是代表 一个数据而已。
        System.out.println(m);

        LocalDate d = LocalDate.of(2013,m,12);
        System.out.println(d);

        Month m1 = Month.of(10);
        System.out.println(m1 == m);

        // 可以获取一个 枚举 的值。
        System.out.println(m1.plus(1).getValue());

        // 获取 d 的月份。
        System.out.println(Month.from(d).getValue());


    }
}
