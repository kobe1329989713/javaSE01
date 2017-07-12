package com.javaSE04.io.nio;

import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/**
 * Created by kobe on 2017/7/13.0:09
 * <br/>
 * Description:
 * 文件锁。
 */
public class FileLockDemo {
    public static void main(String[] args) throws Exception {
        // rw 又可读，又可写。
        RandomAccessFile r = new RandomAccessFile("f2.txt", "rw");
        FileChannel c = r.getChannel();
        // 在写的时候，来个加锁的操作。在文件锁定时，你是不能保存的。
//        FileLock lock = c.lock();

        // 共享锁，它可以打开文件但是不能修改文件。参数是：文件从0开始到文件总的大小锁定，你也可以指定一个大小，来只锁定文件部分数据。
        FileLock lock = c.lock(0, c.size(), true);

        Thread.sleep(500);
        // 释放锁。
        lock.release();
    }
}
