package com.javaSE.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * 用：FileChannel 类，读写文件。 这个性能快点。
 *  NIO 43 看。
 */
public class FileChannelDemo {
    public static void main(String[] args) throws Exception {
        //read();
        write();
    }

    private static void read() throws IOException {
        // 它得到的是 1970 距离现在的时间。毫秒数。
        long now = System.currentTimeMillis();


        FileInputStream fis = new FileInputStream("f1.txt");
        // 先通过 流把 文件获取到，然后在转换成 FileChannel
        FileChannel c = fis.getChannel(); // 只读
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        while (c.read(buffer) > 0){
            buffer.flip();
            while (buffer.hasRemaining()){
                System.out.print((char) buffer.get());
            }
            buffer.clear();
        }


        System.out.println("-----得到这段代码执行时间。------");
        System.out.println(System.currentTimeMillis() - now);
    }


    public static void write() throws Exception {
        FileOutputStream fos = new FileOutputStream("f7.txt");
        FileChannel c = fos.getChannel(); // 只写。
        String text = "debckdf";
        ByteBuffer buffer = ByteBuffer.wrap(text.getBytes());
        c.write(buffer);
    }



}
