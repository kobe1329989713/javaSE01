package com.javaSE.net;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * 特殊字符的 编码。与 解码。
 */
public class CoderDemo {
    public static void main(String[] args) throws Exception {
        // 编码。
        String p = "this is 2.5%";
        System.out.println(URLEncoder.encode(p,"UTF-8"));
        // 解码。
        String result = URLEncoder.encode(p,"UTF-8");
        System.out.println(URLDecoder.decode(result,"UTF-8"));
    }
}
