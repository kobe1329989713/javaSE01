package com.javaSE.net.net1;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Set;

/**
 * 客服端。
 *  没有完成。
 */
public class NonBlockingClient {
    public static void main(String[] args) throws Exception {
        InetAddress address = InetAddress.getByName("localhost");
        int port = 9000;
        InetSocketAddress socketAddress = new InetSocketAddress(address, port);
        Selector selector = Selector.open();
        SocketChannel channel = SocketChannel.open();
        channel.configureBlocking(false);
        channel.connect(socketAddress);
        channel.register(selector, SelectionKey.OP_CONNECT | SelectionKey.OP_READ | SelectionKey.OP_WRITE);
        while (true){
            if (selector.select() > 0){

            }
        }
    }
    //public static boolean processReadySet(Set<Se>)
}
