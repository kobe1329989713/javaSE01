package com.javaSE.nio;

import java.nio.ByteBuffer;

/**
 * nio 用的主要是：它里面的 Buffer 类。
 *  主要是 创建 Buffer 的方法。
 *  可以理解成一个数组。它主要是和通道打交道。
 */
public class BufferDemo {
    public static void main(String[] args) {

        byte[] b4 = new byte[10];

        ByteBuffer b1 = ByteBuffer.allocate(10);
        ByteBuffer b2 = ByteBuffer.wrap(new byte[]{1,2,3});
        ByteBuffer b3 = ByteBuffer.allocate(10);

        // 装数据。
        int limit = b1.limit();
        for(int i=0; i<limit; i++){
            b1.put((byte) i);
        }

        // 取数据。
        System.out.println(limit);
        for(int i=0; i<limit; i++){
            System.out.print(b1.position() + "：");
            //System.out.println(b1.get());
            System.out.println(b1.get(i));
        }

    }
}
