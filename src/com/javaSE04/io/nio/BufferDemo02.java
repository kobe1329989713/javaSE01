package com.javaSE04.io.nio;

import java.nio.ByteBuffer;

/**
 * Created by kobe on 2017/7/12.0:27
 * <br/>
 * Description:
 */
public class BufferDemo02 {
    public static void main(String[] args) {
        ByteBuffer b = ByteBuffer.allocate(10);

        // 设置Buffer 只读。java.nio.ReadOnlyBufferException 只读Buffer
//        b = b.asReadOnlyBuffer();

//        b.duplicate(); 复制Buffer
        b.slice(); // 分割Buffer。


        for (int i=1;i<b.limit();i++) {
            b.put((byte) i);// put() 一次时，会把位置向后移动一次。
        }

        b.position(0); // 又把位置变成0
        System.out.println("获取当前位置：" + b.position());
        // 5 后面的数据，你在循环时，就不会打印出来了。
        b.limit(5);
        for (int i=0;i<b.limit();i++) {
            System.out.println(b.get()); // 只获取五个数据了，注：五后面的数据还是在的。只不过不把它当成 ByteBuffer 的源数据了。
            // mark 标记。
            if (i == 2) {
                b.mark();
            }
        }
        System.out.println(b.position());
        b.reset(); // 打印出标记位置的哪个 位置。
        System.out.println(b.position());
        System.out.println(b.limit());
        b.flip();
        System.out.println(b.position());
        System.out.println(b.limit());
    }
}
