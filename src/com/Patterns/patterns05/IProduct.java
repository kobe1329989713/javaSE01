package com.Patterns.patterns05;

/**
 * <br/> author：Kobe
 * <br/> date：2017/6/16 0016
 * <br/> time：11:04
 * <br/> now：星期五
 * <br/> description：<br/>
 *
 */
public interface IProduct {
    void send();
}
interface IProvider{
    public IProduct product();
}



class ProductImpl01 implements IProduct{

    @Override
    public void send() {
        System.out.println("11111");
    }
}
class ProductImpl02 implements IProduct{

    @Override
    public void send() {
        System.out.println("222222");
    }
}
class ProviderImpl implements IProvider{
    @Override
    public IProduct product() {
        return new ProductImpl01();
    }
}
class ProviderImpl02 implements IProvider{
    @Override
    public IProduct product() {
        return new ProductImpl02();
    }
}

class ProTest{
    public static void main(String[] args) {


        // 22
        // 1、先factory，才能有Product
        IProvider factory02 = new ProviderImpl02();
        IProduct product02 = factory02.product();
        product02.send();



        IProvider factory01 = new ProviderImpl();
        IProduct product01 = factory01.product();
        product01.send();
    }
}
/**
 *
 * 抽象工厂：
 *      1、定义产品的抽象，产品体系。
 *      2、定义工厂抽象， 工厂体系。
 *
 *  测试(用)
 *      1、先factory，才能有Product（多态）。
 *      2、左边抽象，右边具体（多态）。
 *  工厂 new 具体的工厂，获取这个具体工厂生产的具体产品
 *      IProvider factory01 = new ProviderImpl();
 *
 *  用这个具体的产品，就可以调用这个具体产品的功能。
 *  用抽象的产品来接收，编左 运右 + 多态。
 *      IProduct product01 = factory01.product();
 *
 *  就调用具体产品的功能了。
 *      product01.send();
 *
 *
 *  后面增加一个产品，对应的工厂也要增加一个。
 */
