package com.javaSE.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 *
 */
public class MethodDemo03 {
    public static void main(String[] args) {
        //LocalDate d1 = LocalDate.of(2014,12,25);
        // 改成 枚举 的形式。Month.JANUARY，它就是上面 12 ,就是代表一个月份而已。  重载
        LocalDate d1 = LocalDate.of(2014, Month.JANUARY,25);
        System.out.println(d1);


        LocalDateTime t1 = LocalDateTime.of(2013,1,3,11,57);
        // 根据上面的  年 月 日 时 分 秒，它只获取 年 月 日。
        System.out.println(LocalDate.from(t1));


        // 改变 d1 哪个对象的年份，也可以 修改它的 年 月 。链式调用。
        LocalDate d2 = d1.withYear(2015).withMonth(3);
        System.out.println(d2);


        // 获取
        System.out.println(d2.getYear()+"，" + d2.getMonthValue());

        // 从哪个 1970 xx的 到现在有多少天了。
        Long days = d2.toEpochDay();
        System.out.println(days);

        // 获取 t1 对象里面的时间。
        LocalTime t2 = t1.toLocalTime();
        System.out.println(t2);

        // 在 d2 这个后台 给它加上 时 分 秒。也可以 加一个，重载。
        LocalDateTime t3 = d2.atTime(13,25);
        System.out.println(t3);



        // 输入这个时间的，开始时间。
        System.out.println(d2.atStartOfDay());


        // 在 d2 后面加几天
        System.out.println(d2);
        System.out.println(d2.plusDays(7)); // 负数就是 减几个。
        // 往后台 减少 一个月。
        System.out.println("------------");
        System.out.println(d2.minusMonths(2));
    }

}

