package com.javaSE.string;

/**
 *  String 类，一些常用方法如下： 注：很多方法都是有重载的。
 */
public class StringDemo02 {
    public static void main(String[] args) {

        // 连接字符串。
        System.out.println(String.join("-","a","b","bbb"));
        // 将什么类型，转换成 字符串类，
        System.out.println("----------将什么类型，转换成 字符串类，----------------");
        String.valueOf("22222");
        System.out.println(String.valueOf(new char[]{'a','b','c','d','e'},1,2));
        // 比较。是按字典 顺序 进行比较的。错误返回 -1
        System.out.println("abc".compareTo("bcd"));


        String s1 = "abcdefcdfcda";
        //System.out.println(s1.charAt(2));
        //System.out.println(s1.charAt(s1.length()-1));
        // 注：它有很多重载方法的。练习。
        System.out.println(s1.indexOf("c"));
        // 如果你传的是一个字符串的话。它只找第一个字符下标。
        System.out.println(s1.indexOf("cd"));
        // 它从3的位置开始找 c 的下标，找不到返回 -1 ，也只找第一个字符的。
        System.out.println(s1.indexOf("cd",3));
        // 找这个字符最后的下标。也有重载，和 indexOf() 一样用法。
        System.out.println(s1.lastIndexOf("cd"));
        // 截取。有重载，包括 3，不包括 4 ，这两个方法都是包左不包右。
        System.out.println(s1.substring(3,4));
        // 从 3 这个位置截取到最后一个，包括 3
        System.out.println(s1.substring(3));
        // 去掉空格。哪种转义字符也是去掉的。
        System.out.println(" as ".length());
        System.out.println(" as ".trim().length());
        // 替换。
        System.out.println(s1.replace('c','C'));
        System.out.println(s1.replace("cd","CC"));
        // 判断以什么开头，以什么结尾。
        System.out.println(s1.startsWith("a"));
        System.out.println(s1.endsWith("a"));
        System.out.println("-------------------拆分字符串。--------------------");
        // 拆分字符串。
        String[] str = s1.split("c");
        for (String s : str) {
            System.out.println(s);
        }



        //String s2= "";
        //String s2= null;
        //String s2 = new String();
        // 返回的是 true 哦。
        //System.out.println(s2.isEmpty());
        //System.out.println(s2 == "");
        //System.out.println(s2.equals(""));

        // 空判断最好的写法、如下：
        // 它不会报空指针，结果还是 false
        // String s2= null;
        //System.out.println("".equals(s2));


    }
}
