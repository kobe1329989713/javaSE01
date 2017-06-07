package com.javaSE.net;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * 获取网络上的数据。
 */
public class URLContentDemo {
    public static void main(String[] args) throws Exception {
        //getContent();
        getContent1();
    }

    private static void getContent() throws IOException {
        URL url = new URL("http://www.baidu.com");
        InputStream is = url.openStream();
        BufferedReader r = new BufferedReader(new InputStreamReader(is));
        String s = null;
        while ((s=r.readLine()) != null){
            System.out.println(s);
        }
        r.close();
    }

    static void getContent1() throws Exception {
        URL url = new URL("http://www.baidu.com");
        Class[] c = new Class[]{String.class,BufferedReader.class,InputStream.class};
        Object o = url.getContent(c);
        if(o instanceof String){
            System.out.println(o);
        }else if(o instanceof BufferedReader){
            System.out.println("BufferedReader");
        }else if (o instanceof InputStream){
            System.out.println("InputStream");
            System.out.println(o);
        }else {
            System.out.println("else");
        }
    }
    static void getContent3() throws Exception {
        URL url = new URL("http://www.baidu.com");
        URLConnection c = url.openConnection();
        c.setDoOutput(true);
        c.connect();
        InputStream is = c.getInputStream();
        OutputStream os = c.getOutputStream();
    }
}
