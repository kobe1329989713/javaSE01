package com.javaSE.nio;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;

/**
 * Buffer 02
 */
public class BufferDemo02 {
    public static void main(String[] args) {
        ByteBuffer b = ByteBuffer.allocate(10);
        //b = b.asReadOnlyBuffer(); // 设置只读 Buffer
        // java.nio.ReadOnlyBufferException  只读的 Buffer 你又往里面添加数据就会报它

        b = b.duplicate(); // 复制Buffer。





        // 装数据。
        for (int i = 1; i <= b.limit(); i++) {
            b.put((byte) i); // put() 方法每调用一次会把位置往移动
        }
        b.position(3);
        System.out.println(b.get(3));
        ByteBuffer b1 = b.slice();
        b.put(5,(byte) 100); // 改变这个位置的数据。
        while (b1.hasRemaining()){
            System.out.println(b1.get());
        }
        System.out.println("====================");



        b.position(0); // 把位置设置成 0
        System.out.println(b.position());
        b.limit(5); // 把上限 又设置 5

        for(int i=0; i<b.limit(); i++){
            System.out.println(b.get());
            if(i==2){
                b.mark(); // 设置 标记。
            }
        }
        System.out.println("---------------");
        System.out.println(b.position());// 输出它现在的位置。
        b.reset(); // 把位置复原。它必须和 mark() 一直使用。不是会：java.nio.InvalidMarkException
        System.out.println("---------------");
        System.out.println(b.position());// 输出它现在的位置。
        System.out.println("-----------");
        System.out.println(b.limit()); // 上界。
        b.flip();
        System.out.println("-----------");
        System.out.println(b.limit()); // 上界。


        //b.asCharBuffer(); // 把它个Buffer 改成其它类型的。
        // 小的转 大的类型不支持。

        DoubleBuffer b3 = DoubleBuffer.allocate(10);




    }
}
