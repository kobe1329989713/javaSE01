package com.javaSE05.cn_12.tz01;

import java.util.Scanner;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/08/19/ 19:45 星期六<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>javaSE01<BR>
 */
public class ScannerDemo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int x = sc.nextInt();
            System.out.println("x:" + x);
        }else {
//            throw new IllegalArgumentException("非法参数异常。");
            System.out.println("参数非法。");
        }
    }
}
