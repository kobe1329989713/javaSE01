package com.Patterns.patterns04;

/**
 * <br/> author：Kobe
 * <br/> date：2017/6/16 0016
 * <br/> time：13:45
 * <br/> now：星期五
 * <br/> description：<br/>
 * <p>
 * 代理模式：
 *      代理模式就是多一个代理类出来，替原对象进行一些操作。
 *      AOP
 */
interface ISourceable2 {
    void method();
}
class Source2 implements ISourceable2 {

    @Override
    public void method() {
        System.out.println("原来的方法!");
    }
}
// 代理类。
public class Proxy07 implements ISourceable2 {

    private Source2 source;
    public Proxy07() {
        this.source = new Source2(); // 重点。
    }

    @Override
    public void method() {
        before();
        source.method();
        atfer();
    }

    private void atfer() {
        System.out.println("=方法 后 做=");
    }
    private void before() {
        System.out.println("=方法 前 做=");
    }
}
// end

// test
class ProxyTest {

    public static void main(String[] args) {
        ISourceable2 source = new Proxy07();
        source.method();
    }

}
