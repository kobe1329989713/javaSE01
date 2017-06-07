package com.javaSE.net.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * UDP 传输协议。主要传送一个 音频视频
 */
public class UDPServer {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(9000);
        // 获取客服端 发送数据。
        while (true){
            DatagramPacket dp = new DatagramPacket(new byte[1024],1024);
            ds.receive(dp);
            byte[] data = dp.getData();
            int length = dp.getLength();
            int offset = dp.getOffset();
            String s = new String(data,offset,length);
            System.out.println(s);

            // 响应给客服端的数据。
            ds.send(dp);
        }
    }
}
