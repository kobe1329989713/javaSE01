package com.patterns.patterns08.observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/08/19/ 16:01 星期六<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>javaSE01<BR>
 */
public abstract class AbstractSubject implements ISubject {

    private Vector<IObserver> vector = new Vector<>();

    @Override
    public void add(IObserver observer) {
        vector.add(observer);
    }

    @Override
    public void del(IObserver observer) {
        vector.remove(observer);
    }

    @Override
    public void notifyObserver() {
        Enumeration<IObserver> enumo = vector.elements();
        while (enumo.hasMoreElements()) {
            enumo.nextElement().update();
        }
    }

    @Override
    public void operation() {

    }
}
