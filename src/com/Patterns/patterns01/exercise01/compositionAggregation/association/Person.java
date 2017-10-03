package com.Patterns.patterns01.exercise01.compositionAggregation.association;

/**
 *  关联关系：
 *      人要 工作
 *      电脑 发挥作用。
 */
public class Person {
    private Computer computer ;

    public Person(Computer computer){
        this.computer = computer ;
    }

    public void work(){
        computer.develop() ;
        System.out.println("work");
    }
}
