package com.javaSE.nio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.Channel;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;

/**
 * Channel 类使用。
 */
public class ChannelDemo01 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("");
        // 把 FileInputStream 转换成 ReadableByteChannel
        ReadableByteChannel c1 = Channels.newChannel(fis);

        // 流 与 通道 之间相交转换。
        InputStream is = Channels.newInputStream(c1);

        FileChannel c2 = fis.getChannel(); // 只读。
        // 设置 读啊，还是 读写。
        RandomAccessFile f = new RandomAccessFile("","r");

    }
}
