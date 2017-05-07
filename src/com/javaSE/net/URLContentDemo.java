package com.javaSE.net;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * 获取网络上的数据。
 */
public class URLContentDemo {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://www.baidu.com");
        InputStream is = url.openStream();
        BufferedReader r = new BufferedReader(new InputStreamReader(is));
        String s = null;
        while ((s=r.readLine()) != null){
            System.out.println(s);
        }
        r.close();
    }
}
