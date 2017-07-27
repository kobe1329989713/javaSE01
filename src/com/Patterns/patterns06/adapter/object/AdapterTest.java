package com.Patterns.patterns06.adapter.object;

import com.Patterns.patterns06.adapter.classes.Source;
import com.Patterns.patterns06.adapter.classes.Targetable;

/**
 * Created by kobe on 2017/7/27.21:17
 * <br/>
 * Description:
 */
public class AdapterTest {
    public static void main(String[] args) {
        Source s = new Source();
        Targetable t = new Wrapper(s);
        t.method01();
        t.method02();
    }
}
