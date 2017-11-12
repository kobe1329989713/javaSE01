package com.Patterns.patterns01.exercise02.adapter.object;

import com.Patterns.patterns01.exercise02.adapter.classAdapter.ITargetable;
import com.Patterns.patterns01.exercise02.adapter.classAdapter.Source;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/11/12/ 19:33 星期日<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>对象 adapter，见名知意。<BR>
 */
public class Wrapper implements ITargetable {
    private Source source;

    public Wrapper(Source source) {
        super();
        this.source = source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is the targetable method1");
    }
}
