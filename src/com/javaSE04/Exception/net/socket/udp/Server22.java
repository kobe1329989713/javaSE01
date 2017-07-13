package com.javaSE04.Exception.net.socket.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * <br/>Author:Kobe
 * <br/>Date:2017/6/29 0:30
 * <br/>
 * UDP Server,发送短信，用来发送 音频视频，这种。
 */
@SuppressWarnings("Duplicates")
public class Server22 {
    public static void main(String[] args) throws Exception {
        // 监听客服端发过来的 请求。
        DatagramSocket ds = new DatagramSocket(9000);
        while (true) {
            // 获取数据。
            DatagramPacket dp = new DatagramPacket(new byte[1024], 1024);
            // 获取到客服端发过来的数据。
            ds.receive(dp);
            byte[] data = dp.getData(); // 得到数据
            int length = dp.getLength(); // 得到数据长度。
            int offset = dp.getOffset(); // 得到偏移。
            // 就得到完整的客服端发送过来的数据。
            String s = new String(data, offset, length);
            System.out.println(s);

            // 在响应客服端 数据。
            ds.send(dp);
        }
    }
}
