package com.javaSE.nio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
 * MapBuffer 应用。比 io 快。
 */
public class MapBufferDemo {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("f1.txt");
        FileChannel c = fis.getChannel();
        MappedByteBuffer mbb = c.map(FileChannel.MapMode.READ_ONLY,0,c.size());
        while (mbb.hasRemaining()){
            System.out.print((char)mbb.get());
        }
    }
}
