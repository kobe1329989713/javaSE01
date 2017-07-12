package com.javaSE04.io.io01;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

/**
 * Created by kobe on 2017/7/11.23:14
 * <br/>
 * Description:
 * RandomAccessFile  它可以又读又写。
 */
public class RandomAccessFileDemo {
    public static void main(String[] args) throws FileNotFoundException {
        // rw 代表它又可读又可定，还有几种状态。看PPT
        RandomAccessFile f = new RandomAccessFile("f2.txt", "rw");
        // 又从 6 开始看。

        /**
         *  标准输入输出，还有一个 出错了的机制(标准出错)。
         *
         *  键盘：标准的输入 in
         *  显示器：标准的输出 out
         *  java 它这些标准的中间的，如：java 可以获取到我你键盘输入时的，哪个数据。
         *  java 也可以把某些数据显示在你的显示器上。
         */
    }
}
