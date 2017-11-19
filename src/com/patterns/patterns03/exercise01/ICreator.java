package com.patterns.patterns03.exercise01;

/**
 * 抽象工厂模式，顶级。
 */
public interface ICreator {

    // 实现产品等级 1 里面的方法
    IProductA1 factoryA();

    // 实现产品等级 2 里面的方法
    IProductB1 factoryB();
}
