package com.javaSE.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * 字符串轩日期。
 */
public class ParseDemo14 {
    public static void main(String[] args) {
        // 把这个字符串。转换成 日期类型。
        String now = "12/16/2014";
        System.out.println(LocalDate.parse(now, DateTimeFormatter.ofPattern("MM/dd/yyyy")));

        // 第二种写法。
        System.out.println(LocalDate.from(DateTimeFormatter.ofPattern("MM/dd/yyyy").parse(now)));

        // 第三种写法。
        System.out.println(DateTimeFormatter.ofPattern("MM/dd/yyyy").parse(now,LocalDate::from));




    }
}
