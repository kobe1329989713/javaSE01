package com.javaSE04.io.io01;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by kobe on 2017/7/11.22:41
 * <br/>
 * Description:
 * 字符 输入输出流。
 *
 * 处理文件时 老是用 XxxInputStream  XxxOutputStream
 * 但是在处理文本文件时，要write ReaDer 来处理，汉字多的就要用它
 */
public class ReaderDemo {
    public static void main(String[] args) throws Exception {
        FileReader reader = new FileReader("f2.txt"); // 它不合适读取数据，
        BufferedReader br = new BufferedReader(reader); // 在把它包装一层，就好取读取数据了。
        String s = "";
        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }
        reader.close();



    }
}
