package com.javaSE04.io.nio;

import java.nio.ByteBuffer;

/**
 * Created by kobe on 2017/7/11.23:28
 * <br/>
 * Description:
 * NIO 就是新 io的意思，它主要是解决老io 性能差的问题。
 * 老io 是基于流的，性能较差。它是一个一个字节的在处理数据。它的传输单位是 byte 字节。只能单向传输。
 * NIO 它的传输单位是 buffer ,它还是双向数据传输。
 *
 * NIO 是java程序把数据装进Buffer 里面，在把 Buffer给Channel的。如：写数据时
 *      是先把 数据写进Buffer里面，然后在由Channel写到目的地去。
 *      读数据时：也是先从Buffer里面读。 只有缓存里面的数据来自于Channel的。
 *
 *      Channel 与 java 直接打交道的 都是 Buffer
 *
 *
 *
 *     Buffer
 *      1、它有固定长度。
 *      2、它是一个抽象类，它有七个子类，ByteBuffer ShortBuffer ... 前面变就是了。少了boolean。
 *      3、
 *
 *
 */
public class BufferDemo {
    public static void main(String[] args) {

        byte[] b = new byte[10];

        // allocate(10); ，它的容量大小。
        // 因为它是琴抽象类，所以不能用 new ，所以用的是多态。
        ByteBuffer b1 = ByteBuffer.allocate(10);

        // Buffer 创建实例二。
        ByteBuffer b2 = ByteBuffer.wrap(new byte[]{1,2,3});


        // allocateDirect() 特有的方法,它是在操作系统里面分配内存空间,  allocate() 它是直接在内存里面分配空间的.
        ByteBuffer b3 = ByteBuffer.allocateDirect(10);
        int limit = b1.limit();
        for (int i=0;i<limit;i++) {
            b1.put((byte)i);
        }




        // limit 上界
        System.out.println(limit);
        for (int i=0;i<limit; i++) {
            System.out.print(b1.position()+":"); // 获取位置.
            System.out.println(b1.get(i)); // 获取元素
        }
    }
}
