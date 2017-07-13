package com.javaSE04.Exception.net.socket.tcp;

import java.io.OutputStream;
import java.net.Socket;

/**
 * <br/>Author:Kobe
 * <br/>Date:2017/6/29 0:10
 * <br/>
 * Tcp client
 */
public class TCPClient {
    public static void main(String[] args) throws Exception {
        // 往 8888 发请求，请求服务器。
        Socket socket = new Socket("127.0.0.1", 9000);
        OutputStream os = socket.getOutputStream();
        os.write("Hello文言文3".getBytes()); // 把这个值，发往 服务器。
        // Connection reset 出现这个错误，下面操作。
        os.flush();
        os.close();
    }
}
