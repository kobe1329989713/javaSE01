package com.javaSE.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 字符流之 写。
 */
public class WriterDemo {
    public static void main(String[] args) throws IOException {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("f1.txt"))){
            bw.append("hello"); // 把这些数据写入到 f1.txt 文件里面
            bw.newLine(); // 一行行的写入进去
            bw.append("Jack");
            bw.flush();
        }




    }
}
