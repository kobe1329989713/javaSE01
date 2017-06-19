package com.javaSE04.Exception.exception01;

/**
 * <br/>Author:Kobe
 * <br/>Date:2017/6/20 0:10
 * <br/>
 * 测试 自定义异常
 */

class MyResource implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("1、实现 AutoCloseable 接口");
    }
    // 如：你写 JDBC 时，需要在 finally{} 里面来关闭连接
    // 用这种就不用，它自己帮你关闭。
    // 步骤如下：
    /**
     *  1、实现 AutoCloseable 接口
     */
}

public class TestTryWithResource_09 {

    public static void main(String[] args) {
        MyResource resource = new MyResource();
        // 正常的 jdbc 流程如下：
        try {
            // 连接JDBC 代码。
        } catch (Exception e) {
            // 出错咋搞。
        }finally {
            // 在 finally 里面来关闭连接。释放资源
        }


        // 用了 AutoCloseable 接口的 jdbc 代码如下。
        try(
                MyResource resource2 = new MyResource();
                // 如果有多个需要释放资源的，全部统一写 try() 小括号里面。
                // 它是可以自动关闭的。
                MyResource resource3 = new MyResource();

        ) {
            // 连接JDBC 代码。
        } catch (Exception e) { // 注：这个 catch 是不能缺少的。
            // 出错咋搞。
        }
        // 你在 连接完毕以后，它会自动的调用 resource2 里面的
        // 哪个 close() 方法，来释放资源的。

        // 对写 JDBC 连接，文件流的操作 都是有效的。

    }

}
