package com.javaSE.string;

/**
 * StringBuffer 与 StringBuilder 类，它的字符串内容是可变，String 不可以变。
 */
public class StringBufferBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb = sb.append(1).append("abc").append(1.2);
        // capacity() 容量，就是可以放好长的字符串进去。它低层是根据你的字符串长度自动增加的，所以你不用担心太长放不进去的问题。
        System.out.println(sb.length()+"，" + sb.capacity());
        // 在指定位置，插入什么字符串进去。
        sb.insert(1,"kobe");
        // 删除。
        sb.delete(1,4);
        // 删除指定位置字符。
        sb.deleteCharAt(1);
        // 设置长度。超出你设置长度的部分会被截取掉。
        sb.setLength(2);
        // 反转，就是把内容反过来，打印一遍。
        sb.reverse();
        System.out.println(sb);
        
    }
}

