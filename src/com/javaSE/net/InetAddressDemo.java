package com.javaSE.net;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

/**
 * 操作 IP 地址的类。
 */
public class InetAddressDemo {
    public static void main(String[] args) throws Exception {
        // 获取本机IP地址。
        InetAddress a1 = InetAddress.getLocalHost();
        //System.out.println(a1.getHostAddress());

        //InetAddress[] a2 = InetAddress.getAllByName("kobe");
        //for (InetAddress inetAddress : a2) {
        //    System.out.println(inetAddress.getHostAddress());
        //}


        // 获取百度的 ip地址。
        InetAddress a3 = InetAddress.getByName("www.baidu.com");
        System.out.println(a3.getHostAddress());


        // socket
        InetSocketAddress a4 = new InetSocketAddress("kobe",80);
    }
}
