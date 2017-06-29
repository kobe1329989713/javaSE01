package com.javaSE04.Exception.net;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * <br/>Author:Kobe
 * <br/>Date:2017/6/28 23:25
 * <br/>
 *  URI 下面是 RUL 和 RUN
 */
public class URIDemo {
    public static void main(String[] args) throws Exception {
        // 都是得到URI的实例
        URI uri1 = new URI("http://www.baidu.com:80");
        URI uri2 = URI.create("http://www.baidu.com");

        System.out.println(uri1.getScheme()); // 协议
        System.out.println(uri1.getHost());
        System.out.println(uri1.getPort());

        System.out.println(uri1.getPath()); // 得到访问的路径 ，就是哪个 URL
        System.out.println(uri1.getQuery()); // 得到查询的参数样。 就是查询字符串。

        URI uri3 = URI.create("/index.jsp");
        System.out.println(uri1.resolve(uri3));
    }
}
