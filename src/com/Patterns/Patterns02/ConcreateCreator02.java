package com.Patterns.Patterns02;

/**
 * 具体 工厂02
 */
public class ConcreateCreator02 implements ICreator{

    @Override
    public IProduct factory() {
        return new ConcreateProduct02();
    }
}
