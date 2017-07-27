package com.Patterns.patterns06.adapter.object;

import com.Patterns.patterns06.adapter.classes.Source;
import com.Patterns.patterns06.adapter.classes.Targetable;

/**
 * Created by kobe on 2017/7/27.21:09
 * <br/>
 * Description:
 * 对象的适合器。就是让 适合的哪个里有，哪个对象？？
 */
public class Wrapper implements Targetable{

    private Source source;

    public Wrapper(Source source) {
        this.source = source;
    }

    @Override
    public void method01() {
        System.out.println("not");
    }

    @Override
    public void method02() {
        // ???
        source.method01();
    }
}
