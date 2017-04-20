package com.javaSE.string;

/**
 */
public class StringDemo01 {
    public static void main(String[] args) {


        //String s1 = "abc"; // 这个是在 字符串 常量池 里面。
        //String s5 = "a" + "bc";
        //System.out.println(s1==s5); // true 哦。
        //
        //String s4 = "abc";
        //System.out.println(s1==s4);
        //String s2 = new String("abc"); // 这个先是在堆里面去找，找不到在到，在到字符串常量池里面去创建一个，在指向它。
        //String s3 = new String("abc");
        //System.out.println(s1==s2);
        //System.out.println("s2==s3：" + s2==s3);

        final String s1 = "He";
        String s2 = "He";
        System.out.println(s1+"llo"=="Hello");
        System.out.println(s2+"llo"=="Hello"); // false

        // 这个就相同了 true
        System.out.println((s2+"llo").intern()=="Hello"); // false



    }
}







