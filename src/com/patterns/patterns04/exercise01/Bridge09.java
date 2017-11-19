package com.patterns.patterns04.exercise01;

/**
 * <br/> author：Kobe
 * <br/> date：2017/6/16 0016
 * <br/> time：14:12
 * <br/> now：星期五
 * <br/> description：<br/>
 * <p>
 * 桥接模式:
 *      桥接模式就是把事物和其具体实现分开，
 *      将抽象化与实现化解耦，使得二者可以独立变化。
 *      如：JDBC
 */
interface ISourceable3 {
    void method();
}

class Source3Sub1 implements ISourceable3 {
    @Override
    public void method() {
        System.out.println("这是的第 一 子");
    }
}
class Source3Sub2 implements ISourceable3 {
    @Override
    public void method() {
        System.out.println("这是第 二 个子!");
    }
}
// 定义一个桥
public abstract class Bridge09 {
    private ISourceable3 source;
    public void method(){
        source.method();
    }

    public ISourceable3 getSource() {
        return source;
    }
    public void setSource(ISourceable3 source) {
        this.source = source;
    }
}
// 重点。
class MyBridge extends Bridge09 {
    public void method(){
        getSource().method();
    }
}
class BridgeTest {
    public static void main(String[] args) {
        // 获取一个体系里面的 一个具体
        Bridge09 bridge = new MyBridge();

        // 获取一个体系里面的 一个具体
        ISourceable3 source1 = new Source3Sub1();
        bridge.setSource(source1); // 1 的实现
        bridge.method(); // 调用就是 1 哪个实现类的功能。

        /*调用第二个对象*/
        ISourceable3 source2 = new Source3Sub2();
        bridge.setSource(source2);
        bridge.method();
    }
}