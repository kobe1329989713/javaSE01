package com.Patterns.patterns01.exercise02.adapter.object;

import com.Patterns.patterns01.exercise02.adapter.classAdapter.ITargetable;
import com.Patterns.patterns01.exercise02.adapter.classAdapter.Source;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/11/12/ 19:38 星期日<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>javaSE01<BR>
 */
public class TestObjectAdapter {
    public static void main(String[] args) {
        Source s = new Source();
        ITargetable t1 = new Wrapper(s);
        t1.method1();
        t1.method2();
    }
}
