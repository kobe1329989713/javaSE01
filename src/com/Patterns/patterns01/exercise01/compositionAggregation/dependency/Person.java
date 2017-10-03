package com.Patterns.patterns01.exercise01.compositionAggregation.dependency;

/**
 *
 *  依赖：
 *      如：人要 过河 捕鱼 巡逻
 *          般 开动
 */
public class Person {

    public void crossRiver(Boat boat) {
        boat.row();
    }

    public void fishing(){
        Boat boat =new Boat() ;
        boat.row();
    }

    public void patrol(){
        Boat.row() ;
    }

}
