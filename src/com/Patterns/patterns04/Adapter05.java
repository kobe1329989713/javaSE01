package com.Patterns.patterns04;

/**
 * <br/> author：Kobe
 * <br/> date：2017/6/16 0016
 * <br/> time：12:30
 * <br/> now：星期五
 * <br/> description：<br/>
 *
 * 适配器模式：
 *      适配器模式将某个类的接口转换成客户端期望的另一个接口表示，
 *      主要分为三类：类的适配器模式、对象的适配器模式、接口的适配器模式。
 * 注：用的是目标。+ 多态。
 */
// 原始类，它的方法，被适配
class Source{
    public void method1() {
        System.out.println("=这是原始的方法!=");
    }
}
// 目标
interface Targetable{

    /* 与原类中的方法相同 */
    public void method1();

    /* 新类的方法 */
    public void method2();
}
// 这两个适配。

public class Adapter05 extends Source implements Targetable {

    @Override
    public void method2() {
        System.out.println("=适配了。=");
    }
}

//对象的适配器模式
class Wrapper implements Targetable {

    private Source source;

    public Wrapper(Source source) {
        this.source = source;
    }
    public Wrapper() {}

    @Override
    public void method1() {
        System.out.println("=这是原始的方法! instece=");
    }

    @Override
    public void method2() {
        System.out.println("=适配了。=");
    }
}
// end


//接口的适配器模式，我不想实现接口里面所有的方法时用。
interface Sourceable {
    public void method1();
    public void method2();
}
abstract class Wrapper2 implements Sourceable{
    public void method1(){}
    public void method2(){}
}
class SourceSub1 extends Wrapper2{
    @Override
    public void method1() {
        System.out.println("重写方法1111");
    }
}

class Sourcesub2 extends Wrapper2 {
    @Override
    public void method2() {
        System.out.println("重写方法22222");
    }
}
//end


// Test，所有设计模式测试，都是 多态 + 封装 + 继承
class AdapterTest{
    public static void main(String[] args) {
        // Test 接口的适配器模式，
        Sourceable s1 = new SourceSub1();
        Sourceable s2 = new Sourcesub2();
        s1.method1();
        s2.method2();


        // Test 对象的适配器模式
//        Source source = new Source();
//        Targetable target = new Wrapper();
//        target.method1();
//        target.method2();



        // 用的是目标。
//        Targetable target = new Adapter05();
//        // 就可以调用原始类中的方法了。和 新的方法，适配上了。
//        target.method1();
//        target.method2();
    }
}





