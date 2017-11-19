package com.javaSE.date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.*;

/**
 * 什么的第一天 ？？？
 */
public class AdjusterDemo12 {
    public static void main(String[] args) {
        // 当前时间。
        LocalDate now = LocalDate.now();
        System.out.println(now);

        // 找当前时间的下个星期一
        LocalDate d = now.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        System.out.println(d);

        // 这个月的第三个星期二。
        LocalDate d2 = now.with(TemporalAdjusters.dayOfWeekInMonth(3, DayOfWeek.TUESDAY));
        System.out.println(d2);


        // 当前时间 之后的三个月。过两天的日期。
        TemporalAdjuster adjuster = TemporalAdjusters.ofDateAdjuster((LocalDate date) -> date.plusMonths(3).plusDays(2L));
        System.out.println(d.with(adjuster));


        TemporalQuery<LocalDate> d5 = TemporalQueries.localDate();
        System.out.println(now.query(d5));


        TemporalQuery<TemporalUnit> d6 = TemporalQueries.precision();
        LocalTime nowTime = LocalTime.now();
        System.out.println(nowTime.query(d6));

    }
}
