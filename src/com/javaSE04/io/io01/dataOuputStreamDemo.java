package com.javaSE04.io.io01;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 * Created by kobe on 2017/7/11.21:48
 * <br/>
 * Description:
 *  基本数据类型的 输入与输出流。
 */
public class dataOuputStreamDemo {
    public static void main(String[] args) throws Exception {
        DataOutputStream das = new DataOutputStream(new FileOutputStream("f2.txt"));
        // 它是把这些数据，输出把 f2.txt 文件里面去。
        das.writeInt(100);
        das.writeDouble(12.34);
        das.writeUTF("hello");
        // 把这些数据写入到了 f2.txt 文件里面去了。它不是一个文本文件，所以你看不懂的，必须用它专门的
        // DataInputStream 读取出来。



    }
}
