package com.javaSE.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;

/**
 * 日期格式化 和 Sring 类型的 转换成 日期，新老旧时间转换。
 */
public class FormatDemo13 {
    public static void main(String[] args) {
        // 当前时间。
        LocalDate now = LocalDate.now();
        // 格式化 当前日期。  这个常理里面有一个方法。常理还可以调用方法。
        System.out.println(DateTimeFormatter.ISO_DATE.format(now));

        // 第二种写法。和前面哪个一样的。
        System.out.println(now.format(DateTimeFormatter.ISO_DATE));

        // 自定义时间格式化。
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        // 把当前的时间，按这个自定义格式化输出。
        System.out.println(f1.format(now));


                                                                        // 大写 HH 就是 24 小时的。
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        // 你要格式化的哪个时间也必须包含 时间 才行？？？
        System.out.println(f2.format(LocalDateTime.now()));



        // 第三写法。  2014年的圣诞节是：星期四
        DateTimeFormatter f3 = new DateTimeFormatterBuilder().appendValue(ChronoField.YEAR).appendLiteral("年的圣诞节是：").appendText(ChronoField.DAY_OF_WEEK, TextStyle.FULL_STANDALONE).toFormatter();
        LocalDate d = LocalDate.of(2014,12,25);
        System.out.println(f3.format(d));
    }
}
