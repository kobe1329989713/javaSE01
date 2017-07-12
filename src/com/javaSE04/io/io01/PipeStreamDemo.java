package com.javaSE04.io.io01;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * Created by kobe on 2017/7/11.21:06
 * <br/>
 * Description:
 * 管道流：PipedX i o，它是把管道输入输出流结合使用。
 * 只要 输出流 PipeDOutputStream 把数据输出到 管道里面，
 * 管道输入流就能自动的读取数据。没有数据时管道输入流是阻塞的。
 */
public class PipeStreamDemo {
    public static void main(String[] args) throws Exception {
        // 读。
//        PipedInputStream pis = new PipedInputStream();
//        PipedOutputStream pos = new PipedOutputStream(pis);
        // 就把两个 输入与输出结合使用了。


        // 第二种写法。
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();
//        pos.connect(pis);   两个互换也是可以的。
        pis.connect(pos);



        new Thread(() ->product(pos)).start();
        new Thread(() -> consume(pis)).start();

    }


    // 线程，生产消费模式。

    // 生产，因为它要生产了放在哪里去。因为你传入的是一个文件了。这个是没有数据，所以要写入了。
    public static void product(PipedOutputStream pos) {
        try {
            for (int i = 1; i <= 50; i++) {
                pos.write(i);
                pos.flush();
                System.out.println("正在写入" + i);
                Thread.sleep(500);
            }
            pos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    // 消费者。它是从哪里拿数据来消费。这个是有数据 可拿。
    public static void consume(PipedInputStream pis) {
        try {
            int num = -1;
            while ((num = pis.read()) != -1) {
                System.out.println("正常读取：" + num);
            }
            pis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
