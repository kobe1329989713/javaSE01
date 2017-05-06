package com.javaSE.io;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * 字符的，图片、视频。等。
 *
 */
public class DataOuputStreamDemo {
    public static void main(String[] args) throws Exception {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("f4.laotan"));
        // 就把这些数据写入到 f4.kobe 这个文件里面去。
        dos.writeInt(100);
        dos.writeDouble(12.35);
        dos.writeUTF("hello");
        dos.close();

        // 因为它不是用 文本打开查看。用 DataInputStreamDemo 类来读取出来，看这个类。
    }
}
