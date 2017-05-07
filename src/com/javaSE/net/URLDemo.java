package com.javaSE.net;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * URL 应用。
 */
public class URLDemo {
    public static void main(String[] args) throws MalformedURLException {
        URL url1 = new URL("http://www.baidu.com");
        // 如果你得到的是一个 URI 可以调用 toURL() 方法转换成 URL
    }
}
