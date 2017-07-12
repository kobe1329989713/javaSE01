package com.javaSE04.io.io01;

import java.io.DataInputStream;
import java.io.FileInputStream;

/**
 * Created by kobe on 2017/7/11.21:54
 * <br/>
 * Description:
 * 基本数据的
 */
public class DataInputStreamDemo {
    public static void main(String[] args) throws Exception {
        // 读取 DataOutputStream 写入的数据。
        DataInputStream dai = new DataInputStream(new FileInputStream("F2.txt"));
        System.out.println(dai.readInt());
        System.out.println(dai.readDouble());
        System.out.println(dai.readUTF());

        /**
         * 输入与输出，还有对象的序列化与反序列化。它们就像是
         *  编辑器你在 编写代码然后保存(输入，序列化)，写入进去。
         *  然后你在打开这个文件。(输出，反序列化)，就可以看见刚刚你编辑的代码 了？？
         */
    }
}
