package com.javaSE.io;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

/**
 *
 *不属于 InputXxx 和 outputXxx 这些。
 *
 */
public class RandomAccessFileDemo {
    public static void main(String[] args) throws Exception {

        init("f1.txt");
        read("f1.txt");
        read("f1.txt");
        read("f1.txt");

    }

    /**
     * 写入。
     * @param fileName 需要传入的文件名
     * @throws Exception 抛出的异常。
     */
    private static void init(String fileName) throws Exception {
        RandomAccessFile f = new RandomAccessFile(fileName,"rw");
        f.writeInt(200);
        f.writeUTF("string");
        f.close();
    }

    /**
     * 读取数据。
     * @param fileName 和上面一样。
     * @throws Exception 一样。
     */
    private static void read(String fileName) throws Exception {
        RandomAccessFile f = new RandomAccessFile(fileName,"rw");
        int num = f.readInt();
        String name = f.readUTF();
        System.out.println(num + "，" + name);
        long p = f.getFilePointer(); // 它可以记录、读取到了文件的哪个位置。可用于节点上传
        f.seek(0); // 定位到文件的哪个位置
        num = f.readInt();
        num++;
        f.seek(0);
        f.writeInt(num);
        f.seek(p);
    }





}
