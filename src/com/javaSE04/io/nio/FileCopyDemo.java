package com.javaSE04.io.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

/**
 * Created by kobe on 2017/7/13.0:22
 * <br/>
 * Description:
 * 文件复制，用channel 通道的方式。
 */
public class FileCopyDemo {
    public static void main(String[] args) throws Exception {
        try (FileChannel src = new FileInputStream("f2.txt").getChannel();// 源数据。
             FileChannel des = new FileOutputStream("f2_bak.txt").getChannel()// 目的地
        ) {
            //                     位置，大小，目的地。
//            src.transferTo(0, src.size(), des);

            // 第二种方法。
            des.transferFrom(src, 0, src.size());
        }
    } // 符号链接符号，就相当于是 windows 里面的快捷方式样。
}
