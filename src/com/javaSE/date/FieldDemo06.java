package com.javaSE.date;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

/**
 *
 */
public class FieldDemo06 {
    public static void main(String[] args) {
        // 获取当前的 年 月 日 时 分 秒 毫秒。
        // 也可以 调用方法 单独获取它们某一个。
        LocalDateTime t = LocalDateTime.now();
        System.out.println(t);
        // 通过 枚举 来获取 年 月 日 时 分 秒 毫秒。把后面 枚举 改下就好。
        System.out.println(t.get(ChronoField.YEAR));
        System.out.println(t.get(ChronoField.MONTH_OF_YEAR));



    }
}
