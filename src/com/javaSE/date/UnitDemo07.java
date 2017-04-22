package com.javaSE.date;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 */
public class UnitDemo07 {
    public static void main(String[] args) {
        // 当前时间。
        LocalDate now = LocalDate.now();
        System.out.println(now);
        // 四天之后时间。
        System.out.println(now.plus(4, ChronoUnit.DAYS));
        // 加四个星期。
        System.out.println(now.plus(4, ChronoUnit.WEEKS));
    }
}
