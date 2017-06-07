package com.javaSE.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *  java.net.SocketException: Connection reset
 *  出现这个错误，你
 *      os.flush();
        os.close(); 这两个方法 调用下。
 *
 * ServerSocket 应用。
 *  服务端 代码。
 */
public class TCPServer {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(9000);
        while (true) {
            Socket socket = server.accept();
            InputStream is = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String msg = null;
            while ((msg = reader.readLine()) != null) {
                System.out.println(msg);
            }
            socket.close();
        }
    }
}
