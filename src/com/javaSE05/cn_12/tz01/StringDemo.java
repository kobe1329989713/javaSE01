package com.javaSE05.cn_12.tz01;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/08/19/ 19:51 星期六<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>javaSE01<BR>
 */
public class StringDemo {
    public static void main(String[] args) {



        byte[] bys = { 97, 98, 99, 100, 101 };
        String s2 = new String(bys);
        System.out.println("s2:" + s2);
        System.out.println("s2.length():" + s2.length());
        System.out.println("--------------------------");

        // 字符串 转换成 byte[] 数组
        String str = "在哪里(⊙o⊙)口kasdfl;kjasdfhasdf";
        byte[] bs = str.getBytes();
        for (byte b : bs) {
            System.out.println(b);
            System.out.println();
        }
//        byte[] 数组 转换成 字符串。
        String s1 = new String(bs);
        System.out.println(s1);

        s1.indexOf("2"); // 这个位置的 索引 返回来
        Integer d = new Integer(22);
//        valueOf(int i):把int类型的数据转成字符串。 它有很多重载方法。

    }
}
