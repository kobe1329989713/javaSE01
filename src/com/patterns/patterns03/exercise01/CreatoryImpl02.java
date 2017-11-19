package com.patterns.patterns03.exercise01;

/**
 * 具体工厂 02
 */
public class CreatoryImpl02 implements ICreator {
    @Override
    public IProductA1 factoryA() {
        return new ProductA1Imple02();
    }

    @Override
    public IProductB1 factoryB() {
        return new ProductB1Imple02();
    }
}
