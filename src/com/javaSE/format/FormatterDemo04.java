package com.javaSE.format;

import java.util.Formatter;

/**
 * 另一个 格式化的 类。
 */
public class FormatterDemo04 {
    public static void main(String[] args) {
        // 格式化一个 字符串。
        Formatter f1 = new Formatter();
                                // 字符串 按照前面哪个样式。输出字符串。
        System.out.println(f1.format("%s|%s","abc","def"));
    }
}
