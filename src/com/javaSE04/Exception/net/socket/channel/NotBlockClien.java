package com.javaSE04.Exception.net.socket.channel;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * <br/>Author:Kobe
 * <br/>Date:2017/6/29 1:30
 * <br/>
 * 非阻塞式，客服端。
 *
 *  要把 6 的理念理解，都能理解这里面。
 *
 */
@SuppressWarnings("Duplicates")
public class NotBlockClien {
    public static void main(String[] args) throws Exception {
        // ip
        InetAddress address = InetAddress.getByName("localhost");
        // 端口。
        int port = 9000;
        InetSocketAddress socketAddress = new InetSocketAddress(address, port);
        Selector selector = Selector.open();
        SocketChannel channel = SocketChannel.open();
        channel.configureBlocking(false);
        channel.connect(socketAddress);
        // 注册 selector
        channel.register(selector, SelectionKey.OP_CONNECT | SelectionKey.OP_READ | SelectionKey.OP_WRITE);
        while (true) {
            if (selector.select() > 0) {

            }
        }

    }


    public static boolean processReadSet(Set<SelectionKey> keys) {
        Iterator<SelectionKey> iterator = keys.iterator();
        SelectionKey key = null;
        while (iterator.hasNext()) {
            key = iterator.next();
            iterator.remove();
            if (key.isConnectable()) {

            }
            if (key.isReadable()) {

            }
            if (key.isWritable()) {

            }
        }
        return false;
    }


}
