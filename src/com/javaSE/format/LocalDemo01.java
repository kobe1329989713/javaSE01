package com.javaSE.format;

import java.util.Locale;

/**
 * 格式化包含 数字的这些
 * Locale 标示 语言环境。
 */
public class LocalDemo01 {
    public static void main(String[] args) {
        // 得到一些国家的语言环境， default 当前国家的，也就是中国。
        //Locale locale = Locale.getDefault();
        // 美国 的环境。
        Locale locale = Locale.US;
        // 国家
        System.out.println(locale.getCountry());
        // 语言。
        System.out.println(locale.getLanguage());
        // 显示国家。显示就是 以这个 国家的语言打印出来。
        System.out.println(locale.getDisplayCountry());
        // 显示语言。
        System.out.println(locale.getDisplayLanguage());


    }
}
