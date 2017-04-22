package com.javaSE.date;

import java.time.Year;
import java.time.YearMonth;

/**
 * 得到部分时间。
 */
public class PartialDemo11 {
    public static void main(String[] args) {
        // 它们就是得到部分时间，具体用法和前面哪些类差不多的。
        Year y = Year.of(2014);
        YearMonth ym = YearMonth.of(2014,12);
    }
}
