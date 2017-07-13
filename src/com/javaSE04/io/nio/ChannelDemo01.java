package com.javaSE04.io.nio;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;

/**
 * Created by kobe on 2017/7/12.1:07
 * <br/>
 * Description:
 * 通道。
 */
public class ChannelDemo01 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("");
        // 把一个流转换成 通道。
        ReadableByteChannel c1 = Channels.newChannel(fis);

        // 在转换成 流。
        InputStream is = Channels.newInputStream(c1);


        // 流。转换成一个 FileChannel
        FileChannel c2 = fis.getChannel(); // 只读。
        // 随机访问文件。它是什么(可读还是可写还是)，然后得到的通道就是什么。
        RandomAccessFile f = new RandomAccessFile("", "r");
        f.getChannel();

        // 还有很多转换的东东。
    }
}
