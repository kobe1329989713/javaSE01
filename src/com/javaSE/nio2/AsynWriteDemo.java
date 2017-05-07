package com.javaSE.nio2;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.CompletionHandler;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * 通过 异步 来 读写文件。
 */
public class AsynWriteDemo {
    private static class Attrachment{
        public Path path;
        public ByteBuffer buffer;
        public AsynchronousFileChannel channel;
    }

    private static class WriteHandler implements CompletionHandler<Integer,Attrachment>{
        @Override
        public void completed(Integer result, Attrachment attachment) {
            try {
                attachment.channel.close();
                System.out.println("写数据完成");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void failed(Throwable exc, Attrachment attachment) {
            System.out.println(exc.getMessage());
            try {
                attachment.channel.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) throws Exception {
        Path path = Paths.get("aw.txt");
        AsynchronousFileChannel afc = AsynchronousFileChannel.open(path, StandardOpenOption.WRITE,StandardOpenOption.CREATE);

        Attrachment a = new Attrachment();
        a.buffer = getData();
        a.path = path;
        a.channel = afc;
        afc.write(getData(),0,a,new WriteHandler());
        Thread.sleep(5000);
        System.out.println("完成");
    }


    private static ByteBuffer getData(){
        return ByteBuffer.wrap("Hello".getBytes());
    }
}
