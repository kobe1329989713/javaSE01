package com.javaSE.nio;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/**
 * FileLock 文件锁。
 */
public class FileLockDemo {
    public static void main(String[] args) throws Exception {
        RandomAccessFile r = new RandomAccessFile("f2.txt","rw");
        FileChannel c = r.getChannel();
        // 排它锁。
        //FileLock lock = c.lock();
        // 共享锁。
        FileLock lock = c.lock(0,c.size(),true);
        Thread.sleep(5000);
        lock.release();
    }
}
