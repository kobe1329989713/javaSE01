package com.javaSE04.Exception.net.socket.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * <br/>Author:Kobe
 * <br/>Date:2017/6/29 0:39
 * <br/>
 * UDP
 *      客服端 往 服务器 发送数据。
 *
 *
 *
 *
 *
 */
public class UDPClient {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket();
        // 发送给服务器的消息。数据。
        String msg = "hello而且22";
        // 把数据封装进一个，数据包(DatagramPacket)，里面去。
        DatagramPacket p = new DatagramPacket(msg.getBytes(), msg.getBytes().length);
        // 设置一些服务器的相关的东东，因为你数据准备好了，你肯定要知道发往哪里去卅。
        p.setAddress(InetAddress.getByName("localhost"));
        // 设置 端口叼。
        p.setPort(9000);
        // 开始发送。
        ds.send(p);


        // 在接收服务器返回来的数据。
        ds.receive(p);
        byte[] data = p.getData();
        int length = p.getLength();
        int offset = p.getOffset();
        String s = new String(data, offset, length);
        System.out.println(s);
    }
}
