package com.Patterns.patterns04;

/**
 * <br/> author：Kobe
 * <br/> date：2017/6/16 0016
 * <br/> time：13:33
 * <br/> now：星期五
 * <br/> description：<br/>
 * <p>
 * 装饰模:
 *    动态的给一个对象增加一些新的功能
 *    和 AOP 样。
 */
interface ISourceable {
    public void method();
}
class SourceImpl implements ISourceable {
    @Override
    public void method() {
        System.out.println("SourceImpl=重写method=");
    }
}
public class Decorator06 implements ISourceable {
    private ISourceable source;
    public Decorator06(ISourceable source) {
        this.source = source;
    }
    public Decorator06() {}
    @Override
    public void method() {
        System.out.println("在它调用 前 去干什么");
        source.method(); // 2 里面的实现去调用 1的实现
        System.out.println("在它调用 后 去干什么");
    }
}
class DecoratorTest {
    public static void main(String[] args) {
        ISourceable source = new SourceImpl();
        ISourceable obj = new Decorator06(source);
        obj.method();
    }
}
