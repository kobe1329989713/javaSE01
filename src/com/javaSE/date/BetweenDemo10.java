package com.javaSE.date;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * 时间间隔。
 */
public class BetweenDemo10 {
    public static void main(String[] args) {
        // 第一个时间。
        LocalDate d1 = LocalDate.of(2013,12,1);
        // 第二个时间。
        LocalDate d2 = LocalDate.now();
        // 看这两个时间 间隔了多少天。
        Long days = ChronoUnit.DAYS.between(d1,d2);
        // 相隔多少月，就可以业改变这个枚举，来求，什么 与 什么 相隔多少 什么。
        //Long days = ChronoUnit.MONTHS.between(d1,d2);
        System.out.println(days);

        // 这个也是 求 相间多少 什么的。
        System.out.println(d1.until(d2));
        System.out.println(d1.until(d2,ChronoUnit.MONTHS));


        // 将一个 日期date 与 时间time 来比较。 这种比较是不行的。
        // 只能 日期与日期比较，或者是 时间与时间比较。
        LocalTime t = LocalTime.now();
        //Long days1 = ChronoUnit.DAYS.between(d1,t);
        //System.out.println(days1);



        LocalTime t1 = LocalTime.of(22,10);
        // 比较它们相隔多少分钟，也可以改变哪个常理值，来 比 什么？？
        ChronoUnit.MINUTES.between(t,t1);



        // 部分时间：如：我只想得到一个 年 或者是 年月 或者是  就是部分时间。
    }
}
