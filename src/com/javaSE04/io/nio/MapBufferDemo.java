package com.javaSE04.io.nio;

import java.io.FileInputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by kobe on 2017/7/12.23:38
 * <br/>
 * Description:
 *  文件内存级别的操作。叫：文件内存映射。
 */
public class MapBufferDemo {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("f2.txt");
        // 通过流，获取到通道。
        FileChannel c = fis.getChannel();
                                    //  读取文件                      位置，       大小
//        MappedByteBuffer mbb = c.map(FileChannel.MapMode.READ_ONLY, 0, Integer.MAX_VALUE);
        MappedByteBuffer mbb = c.map(FileChannel.MapMode.READ_ONLY, 0, c.size()); // c.size() 和文件一起大小
        while (mbb.hasRemaining()) {
            System.out.print((char) mbb.get());
        }
    }
}
