package com.javaSE.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * 用方法来得到一个对象。
 * java.time 里面放在的就是 jdk8 新增的时间类。
 *
 *
 */
public class DateDemo02 {
    public static void main(String[] args) {
        // 当前的时间。它获取的直接就是 年月日了，不是时间戳
        LocalDate d = LocalDate.now();
        System.out.println(d); // 2017-04-22
        // 也可以单独打印 年 月 )
        System.out.println(
                d.getYear() + "，" +
                d.getMonthValue() + "，" + // 它的月份不用你去+1 了
                d.getDayOfMonth()
        );


        // 它是直接获取的是 时 分 秒 ，上面哪个是获取：年 月 日
        LocalTime t = LocalTime.now();
        System.out.println(t);



        // 它是获取  年 月 日 时 分 秒，全部都获取。
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);


        // 获取一个特定的 年 月 日
        LocalDate d1 = LocalDate.of(2012,12,3);
        // 获取一个物的  时 分 秒
        LocalTime t1 = LocalTime.of(12,4,7);
        System.out.println(d1);
        System.out.println(t1);

    }
}
