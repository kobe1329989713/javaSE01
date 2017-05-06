package com.javaSE.io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 读取 DataOutputStreamDemo 里面 它写入的哪个数据
 */
public class DataInputStreamdemo {
    public static void main(String[] args) throws Exception {

        DataInputStream dis = new DataInputStream(new FileInputStream("f4.laotan"));

        // 开始读出来。
        System.out.println(dis.readInt());
        System.out.println(dis.readDouble());
        System.out.println(dis.readUTF());

    }
}
