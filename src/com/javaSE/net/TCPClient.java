package com.javaSE.net;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * socket 客服端 代码。
 * 注：必须要把 服务端 和 客服端 一直启动才能看到效果。
 *
 * 用 sochet 进行通信。
 *  一直监听一个端口号。
 */
public class TCPClient {
    public static void main(String[] args) throws Exception {
        // 访问一个服务器。
        Socket socket = new Socket("localhost",9000);
        OutputStream os = socket.getOutputStream();
        os.write("Hello java".getBytes());
        os.flush();
        os.close();
    }
}
