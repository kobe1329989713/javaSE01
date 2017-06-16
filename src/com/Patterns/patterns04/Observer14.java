package com.Patterns.patterns04;

import java.util.Enumeration;
import java.util.Vector;

/**
 * <br/> author：Kobe
 * <br/> date：2017/6/16 0016
 * <br/> time：15:33
 * <br/> now：星期五
 * <br/> description：<br/>
 *
 * 观察者模式：
 *    类和类之间的关系，
 *    不涉及到继承
 */
// 体系结构
interface Observer {
    void update();
}

class Observer1 implements Observer {

    @Override
    public void update() {
        System.out.println("observer 1 已经收到了!");
    }
}

class Observer2 implements Observer {

    @Override
    public void update() {
        System.out.println("observer 2 已经收到了!");
    }

}
// end

// 另一个体系
interface Subject {

    /*增加观察者*/
    public void add(Observer observer);

    /*删除观察者*/
    public void del(Observer observer);

    /*通知所有的观察者*/
    public void notifyObservers();

    /*自身的操作*/
    public void operation();
}

abstract class AbstractSubject implements Subject {

    private Vector<Observer> vector = new Vector<Observer>();

    @Override
    public void add(Observer observer) {
        vector.add(observer);
    }

    @Override
    public void del(Observer observer) {
        vector.remove(observer);
    }

    @Override
    public void notifyObservers() {
        Enumeration<Observer> enumo = vector.elements();
        while (enumo.hasMoreElements()) {
            enumo.nextElement().update();
        }
    }
}
// end

class MySubject extends AbstractSubject {
    @Override
    public void operation() {
        System.out.println("更新自我!!");
        notifyObservers();
    }

}

// test
public class Observer14 {
    public static void main(String[] args) {
        Subject sub = new MySubject();
        sub.add(new Observer1());
        sub.add(new Observer2());

        sub.operation();
    }
}
