package com.javaSE.nio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

/**
 * 文件 复制。
 */
public class FileCopyDemo {
    public static void main(String[] args) throws Exception {
        try(FileChannel src = new FileInputStream("f2.txt").getChannel();
        FileChannel des = new FileOutputStream("f2_bak.txt").getChannel()){
            //              0 全部copy 过去。源文件大小， copy 到哪个文件里面。
            //src.transferTo(0,src.size(),des);
            // 第二种写法。
            des.transferFrom(src,0,src.size());
        }
    }
}
