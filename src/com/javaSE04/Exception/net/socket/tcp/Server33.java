package com.javaSE04.Exception.net.socket.tcp;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * <br/>Author:Kobe
 * <br/>Date:2017/6/29 0:01
 * <br/>
 * TCP 的 server
 *
 *  它是先把 连接创建好，然后数据在这个连接 之间来回传送。
 *
 */
@SuppressWarnings("Duplicates")
public class Server33 {
    public static void main(String[] args) throws Exception {
        /**
         * 监听客服端请求。就是获取一个请求，用 socket来表示。
         * 就可以调用 socket 里面方法，
         */
        //ServerSocket socket = new ServerSocket(8888);
        //Socket socket1 = socket.accept();
        //// 接收客服端的请求，就不接收客服端的参数。返回客服端就是 outputStream
        //InputStream is = socket1.getInputStream();
        //BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        //String msg = null;
        //while ((msg = reader.readLine()) != null) {
        //    System.out.println(msg);
        //}
        //socket.close();// 关闭连接。


        /**
         * 上面的改进版，不停的监听客服端的请求。
         */
        ServerSocket socket = new ServerSocket(9000);
        while (true) {
            Socket socket1 = socket.accept();
            InputStream is = socket1.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String msg = null;
            while ((msg = reader.readLine()) != null) {
                System.out.println(msg);
            }
            //  Socket is closed 发生这个错误的原因，你的服务器不应该关闭，因为你用死循环 了
            //socket.close();
        }


    }
}
