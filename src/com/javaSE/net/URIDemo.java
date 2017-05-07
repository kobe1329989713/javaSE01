package com.javaSE.net;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * URI 应用。
 */
public class URIDemo {
    public static void main(String[] args) throws Exception {
        // 几种创建形式。
        URI uri1 = new URI("http://www.baidu.com:80");

        URI uri2 = URI.create("http://www.baidu.com");

        System.out.println(uri1.getScheme()); // 协议。
        System.out.println(uri1.getHost()); // ip地址样。
        System.out.println(uri1.getPort()); // 端口号。
        // 得到路径。相当于侵害符样。
        System.out.println(uri1.getPath());
        // 得到查询。跟到 ？号 后面的哪个参数，就是它的查询参数。
        System.out.println(uri1.getQuery());

        // 拼接成一个 新的 URL
        URI uri3 = new URI("/index.jsp");
        System.out.println(uri1.resolve(uri3));
        // URL 是 URI 的子类之一。
    }
}
