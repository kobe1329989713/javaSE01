package com.patterns.patterns03.exercise01;

/**
 * 具体工厂 01
 */
public class CreatoryImpl01 implements ICreator {
    @Override
    public IProductA1 factoryA() {
        return new ProductA1Imple01();
    }

    @Override
    public IProductB1 factoryB() {
        return new ProductB1Imple01();
    }
}
