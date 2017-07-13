package com.javaSE04.Exception.net;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

/**
 * <br/>Author:Kobe
 * <br/>Date:2017/6/28 23:13
 * <br/>
 * ip 地址。 主要就是两个类 InetAddress 和 InetSocketAddress
 */
public class InetAdressDemo {
    public static void main(String[] args) throws Exception {
        // 获取本机 ip 地址。
        InetAddress a1 = InetAddress.getLocalHost();
        System.out.println(a1.getHostAddress()); // 得到的是其中一个。

        //InetAddress[] a2 = InetAddress.getAllByName("Administrator"); // 根据电脑名获取所以 ip 地址。
        //for (InetAddress address : a2) {
        //    System.out.println(address.getHostAddress());
        //}


        InetAddress a3 = InetAddress.getByName("www.baidu.com");
        System.out.println(a3.getHostAddress());

        // socket 就是 ip地址 加 端口
        InetSocketAddress a4 = new InetSocketAddress("kobe", 80);

    }
}
