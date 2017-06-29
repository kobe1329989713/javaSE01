package com.javaSE04.Exception.net;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * <br/>Author:Kobe
 * <br/>Date:2017/6/28 23:37
 * <br/>
 * URL 编码 与 解码。
 */
public class CoderDemo {
    public static void main(String[] args) throws Exception {
        String p = "this is 2.5%";
        // 编码，转码，
        System.out.println(URLEncoder.encode(p, "UTF-8"));
        String result = URLEncoder.encode(p, "UTF-8");
        // 解码，就是 p ，这个字符串，给还原了。
        System.out.println(URLDecoder.decode(result, "UTF-8"));
    }
}
