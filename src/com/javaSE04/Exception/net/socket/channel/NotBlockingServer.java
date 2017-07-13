package com.javaSE04.Exception.net.socket.channel;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.util.Iterator;
import java.util.Set;

/**
 * <br/>Author:Kobe
 * <br/>Date:2017/6/29 1:12
 * <br/>
 *  非阻塞 server
 *


 *   *   非阻塞式 Socket
 *         你去吃 汉包，
 *         你点了单，由前端服务员把定单给后台服务员来处理。然后前端服务员继续服务其它顾客。
 *      异步：
 *      效率高。
 *
 *      阻塞式 Socket
 *          你把定单给前端服务员，前端服务员把定单在给后台服务员，后台服务员处理完了，在返回给
 *          前端服务员，前端服务员在给你，前端服务员一条龙的服务。
 *      同步：
 *
 */
@SuppressWarnings("Duplicates")
public class NotBlockingServer {
    public static void main(String[] args) throws Exception {
        // ip
        InetAddress address = InetAddress.getByName("localhost");
        // 端口。
        int port = 9000;
        // 得到一个 selector 实例。
        Selector selector = Selector.open();
        // 就相当于 socket 样。
        ServerSocketChannel server = ServerSocketChannel.open();
        // 设置成非阻塞的。因为它默认是阻塞
        server.configureBlocking(false);
        // 把 ip 和 端口 绑定上
        server.bind(new InetSocketAddress(address, port));
        // 这样它就开始监听了，也可以监听事件，

        // 注册 selector 选择器， SelectionKey.OP_ACCEPT 它代表有一个 请求到达客服端。
        server.register(selector, SelectionKey.OP_ACCEPT);

        // 死循环，不停来处理请求。
        while (true) {
            // 说明没有请求需要 处理。
            if (selector.select() <= 0) {
                continue;
            }
            processReadySet(selector.selectedKeys());
        }

    }


    // 处理准备好的集合。
    public static void processReadySet(Set<SelectionKey> keys) throws Exception {
        Iterator<SelectionKey> iterator = keys.iterator();
        SelectionKey key = null;
        while (iterator.hasNext()) {
            key = iterator.next();
            iterator.remove();
            if (key.isAcceptable()) {
                processAccept(key);
            }
            if (key.isReadable()) {
                processRead(key);
            }
        }
    }


    public static void processAccept(SelectionKey key) throws Exception {
        ServerSocketChannel sc = (ServerSocketChannel) key.channel();
        SocketChannel c = sc.accept();
        c.configureBlocking(false);
        c.register(key.selector(), SelectionKey.OP_READ);
    }
    public static void processRead(SelectionKey key) throws Exception {
        SocketChannel c = (SocketChannel) key.channel();
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        int byteCount = c.read(buffer);
        String msg = "";
        if (byteCount > 0) {
            buffer.flip();
            Charset charset = Charset.forName("UTF-8");
            CharsetDecoder decoder = charset.newDecoder();
            CharBuffer charBuffer = decoder.decode(buffer);
            msg = charBuffer.toString();
            System.out.println(msg);
        }
    }

}
