package com.javaSE.format;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * 数字 格式化。
 */
public class NumberFormatDemo03 {
    public static void main(String[] args) {
        // 中国默认 数字格式化 的样式。
        //NumberFormat f1 = NumberFormat.getNumberInstance(Locale.getDefault());
        // 美国 数字格式化 样式。
        NumberFormat f1 = NumberFormat.getNumberInstance(Locale.US);
        System.out.println(f1.format(2344235435345L));

        // 用钱相关的 样式 来 格式化。来格式这个 数字。
        f1 = NumberFormat.getCurrencyInstance();
        System.out.println(f1.format(2344235435345L));


        // DecimalForma 的格式化，前面保留几位，后台保留几个小数。
        DecimalFormat f2 = new DecimalFormat("###.###");
        System.out.println(f2.format(123.3344334344));
    }
}
