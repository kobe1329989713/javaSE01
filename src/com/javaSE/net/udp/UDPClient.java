package com.javaSE.net.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * UDP 客服端。
 *
 *  客服端接收数据，服务器来处理。在响应给客服部。
 */
public class UDPClient {
    public static void main(String[] args) throws Exception {
        // 发往服务商数据。
        DatagramSocket ds = new DatagramSocket();
        String msg = "Hello3333";
        DatagramPacket p = new DatagramPacket(msg.getBytes(),msg.getBytes().length);
        p.setAddress(InetAddress.getByName("localhost"));
        p.setPort(9000);
        ds.send(p);

        // 接收住。服务器响应过来的数据。
        ds.receive(p);
        byte[] data = p.getData();
        int length = p.getLength();
        int offset = p.getOffset();
        String s = new String(data,offset,length);
        System.out.println(s);
    }
}
