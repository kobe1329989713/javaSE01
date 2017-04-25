package com.javaSE.format;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * 日期格式化。
 */
public class DateFormateDemo02 {
    public static void main(String[] args) {
        // 获取 DateFormat 对象。                    输出样式，       语言环境。
        //DateFormat f1 = DateFormat.getDateInstance(DateFormat.LONG, Locale.CHINESE);
        DateFormat f1 = DateFormat.getDateInstance(DateFormat.SHORT, Locale.US);
        // 把当前的时间，按 哪个样式，中国语言环境输出。
        System.out.println(f1.format(new Date()));


        // SimpleDateForma 类是：自定义样式 输出。
        SimpleDateFormat f2 = new SimpleDateFormat("yyyy**MM**dd");
        f2.applyPattern("MM-dd-yyyy"); // 按照这种格式，把当前日期输出。
        System.out.println(f2.format(new Date()));


        //
    }
}
