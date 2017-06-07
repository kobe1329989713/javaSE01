package com.javaSE.net.net1;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
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
 * 非阻挡 通道。
 * 服务器 代码。
 */
public class NonBlockingServer {
    public static void main(String[] args) throws Exception {
        InetAddress address = InetAddress.getByName("localhost");
        int port = 9000;
        Selector selector = Selector.open();
        ServerSocketChannel server = ServerSocketChannel.open();
        // 非阻止的
        server.configureBlocking(false);
        server.bind(new InetSocketAddress(address,port));
        server.register(selector, SelectionKey.OP_ACCEPT);
        // 处理客服端请求。
        while (true){
            if (selector.select() <= 0){
                continue;
            }
            processReadySet(selector.selectedKeys());
        }
    }
    // 处理准备好的集合。
    public static void processReadySet(Set<SelectionKey> keys) throws IOException {
        Iterator<SelectionKey> iterator = keys.iterator();
        SelectionKey key = null;
        while (iterator.hasNext()){
            key = iterator.next();
            iterator.remove();
            if (key.isAcceptable()){
                processAccept(key);
            }
            if (key.isReadable()){
                processRead(key);
            }
        }
    }
    public static void processAccept(SelectionKey key) throws IOException {
        ServerSocketChannel sc = (ServerSocketChannel) key.channel();
        SocketChannel c = sc.accept();
        c.configureBlocking(false);
        c.register(key.selector(),SelectionKey.OP_ACCEPT);
    }
    public static void processRead(SelectionKey key) throws IOException {
        SocketChannel c = (SocketChannel) key.channel();
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        int byteCount = c.read(buffer);
        String msg = "";
        if (byteCount > 0){
            buffer.flip();
            Charset charset = Charset.forName("UTF-8");
            CharsetDecoder decoder = charset.newDecoder();
            CharBuffer charBuffer = decoder.decode(buffer);
            msg = charBuffer.toString();
            System.out.println(msg);
        }
    }
}
