package com.javaSE.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * 处理 字符串的 流，字符流。 之 读
 */
public class ReaderDemo {
    public static void main(String[] args) throws Exception {

        FileReader reader = new FileReader("f1.txt");
        BufferedReader br = new BufferedReader(reader);
        String s = "";
        // 一行一行 读取
        while ((s = br.readLine()) != null){
            System.out.println(s);
        }
        reader.close();
    }
}
