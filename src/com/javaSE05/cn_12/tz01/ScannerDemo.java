package com.javaSE05.cn_12.tz01;

import java.util.Locale;
import java.util.Scanner;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/08/19/ 18:46 星期六<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>
 *
 * protected 只能同一个包下，或者是 不同同的子类 所访问。
 *
 * <BR>
 */
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();


        Locale l = new Locale("zh_CN_0kobe");
        sc.useLocale(l);
        System.out.println(sc.locale());

        sc.useRadix(4);
        System.out.println("返回此扫描器的默认基数:" + sc.radix());


        System.out.println("hasNext():" + sc.hasNext());


        System.out.println("x：" + x);





    }
}
