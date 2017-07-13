package com.javaSE04.Exception.net;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * <br/>Author:Kobe
 * <br/>Date:2017/6/28 23:34
 * <br/>
 * URL
 */
public class URLDmo {
    public static void main(String[] args) throws Exception {
        URL url1 = new URL("http://www.baidu.com:80");
        // URI 转换成 URL  toUrl()，URI 和 URL 差不多
        System.out.println(url1.getUserInfo());

        // 然后就是 URL 的编码与解码了。

    }
}
