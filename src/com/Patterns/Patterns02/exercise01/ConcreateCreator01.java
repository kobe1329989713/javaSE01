package com.Patterns.Patterns02.exercise01;

/**
 * 具体 工厂01
 */
public class ConcreateCreator01 implements ICreator{

    @Override
    public IProduct factory() {
        return new ConcreateProduct01();
    }
}
