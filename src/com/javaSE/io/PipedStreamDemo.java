package com.javaSE.io;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * 管理道。双读取 又写入。它是 读取 写入 到管道里面去。
 */
public class PipedStreamDemo {
    public static void main(String[] args) throws IOException {
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();

        pis.connect(pos);

        new Thread(() -> produce(pos)).start();
        new Thread(() -> consume(pis)).start();

    }

    /**
     *
     */

    /**
     * 生产者。
     *
     * @param pos 写入的。
     */
    public static void produce(PipedOutputStream pos) {
        try {
            for (int i = 1; i <= 50; i++) {
                pos.write(i);
                pos.flush();
                System.out.println("正在写入：" + i);
                Thread.sleep(500);
            }
            pos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 消费者。
     * @param pis 读取的。
     */
    public static void consume(PipedInputStream pis) {
        try {
            int num = -1;
            while ((num = pis.read()) != -1) {
                System.out.println("读取：" + num);
            }
            pis.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
