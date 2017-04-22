package com.javaSE.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * java 简单正则表达式,之 String中正则表达式
 * 注要就是要会写 正则表达式。
 */
public class RegexDemo01 {
    public static void main(String[] args) {
        // 匹配
        String reg = "a[def]c";
        String s = "sadcr";
        // 正则表达式用法，一个参数接收一个 正则表达式 返回一个Boolean 值。
        System.out.println(s.matches(reg));
        System.out.println("cdeabcadcbhafca".replaceAll(reg,"X"));
        System.out.println("cdeabcadcbhafca".replace(reg,"X"));

        // 这种正则表达式，现在是一个字符串，是不好，
        // 要把这种写好的正则表达式放在 Pattern 类中。因为存在JDK 里面的一种特定格式，使匹配的更快使匹
        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher("cdeabcadcbhafca");
    }
}


