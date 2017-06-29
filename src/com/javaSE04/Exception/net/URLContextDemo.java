package com.javaSE04.Exception.net;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * <br/>Author:Kobe
 * <br/>Date:2017/6/28 23:42
 * <br/>
 * 通过URL 来 获取URL里面的内容，通过 IO 来
 *
 * 注：就是获取内容。
 */
@SuppressWarnings("Duplicates")
public class URLContextDemo {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://www.baidu.com");
        // 获取这个URL里面的内容。
        InputStream is = url.openStream();
        BufferedReader r = new BufferedReader(new InputStreamReader(is));
        String s = null;
        while ((s = r.readLine()) != null) {
            //System.out.println(s);
        }
        r.close();


        // 可以把 获取到里面的 URL ，可以下载一个文件。
        getContent1();
    }


    static void getContent1() throws Exception {
        getContent2();
    }

    public static void getContent2() throws IOException {
        URL url = new URL("http://www.baidu.com");
        Class[] c = new Class[]{String.class, BufferedReader.class, InputStream.class};
        Object o = url.getContent(c);
        if (o instanceof String) {
            System.out.println(o);
        } else if (o instanceof BufferedReader) {
            System.out.println("BufferedReader");
        } else if (o instanceof InputStream) {
            System.out.println("InputStream");
        } else {
            System.out.println("else");
        }
    }

    // 它就相当于是一个 post 请求样。可以往服务器传递参数了。
    static void getContext03() throws Exception {
        URL url = new URL("http://www.baidu.com");
        URLConnection c = url.openConnection();
        c.setDoOutput(true); // 就可以传递参数，到服务器端了。
        c.connect();
        InputStream is = c.getInputStream();
        OutputStream os = c.getOutputStream(); // 就往服务器端写数据
    }


}
