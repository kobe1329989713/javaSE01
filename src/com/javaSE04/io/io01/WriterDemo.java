package com.javaSE04.io.io01;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * Created by kobe on 2017/7/11.23:07
 * <br/>
 * Description:
 * 字符流的，之写。
 */
public class WriterDemo {
    public static void main(String[] args) throws Exception {
        // 往这个文件里面写数据。
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("f2.txt"))) {
            bw.append("heloo222===往这个文件里面写数据。");
            bw.newLine();  // 换行。
            bw.append("kboe Love mar");
            bw.newLine();
            bw.write("33333");
            bw.flush();
            bw.close();

            /**
             *  字符的 输入输出流，很方便的读取与写入字符类型的数据。不会出现乱码了。
             */
        }
    }
}
