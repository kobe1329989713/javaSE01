package com.javaSE04.io.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by kobe on 2017/7/12.1:26
 * <br/>
 * Description:
 *  通过 FileChannel 来读取文件。
 */
public class FileChannelDemo {
    public static void main(String[] args) throws Exception {
//        write();
        read();
    }


    // 写入数据。
    public static void write() throws Exception {
        FileOutputStream fos = new FileOutputStream("f2.txt");
        FileChannel c = fos.getChannel();
        String text = "kobelovLkdfs";// 把它写入到 f2.txt 文件里面去。
        ByteBuffer buffer = ByteBuffer.wrap(text.getBytes());
        c.write(buffer);
        fos.flush();
        fos.close();
    }







    // 读取数据。
    private static void read() throws IOException {
        // 计算执行时间。
        long now = System.currentTimeMillis();


        FileInputStream fis = new FileInputStream("f2.txt");
        // 在通过流，得到通道。
        FileChannel c = fis.getChannel();
        // 就可以操作通道了，注：通道也是把 数据写入到Buffer里面的，或者是从Buffer里面读取数据出来。
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        // 用通道把数据读取到Buffer中。
        while (c.read(buffer) > 0) {
            buffer.flip();
            while (buffer.hasRemaining()) {
                System.out.print((char)buffer.get());
            }
            buffer.clear();
        }


        // 计算执行时间。
        System.out.println();
        System.out.print("计算执行时间：" );
        System.out.println(System.currentTimeMillis() - now);
    }
}
