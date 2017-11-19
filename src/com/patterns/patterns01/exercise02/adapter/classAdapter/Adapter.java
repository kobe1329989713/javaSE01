package com.patterns.patterns01.exercise02.adapter.classAdapter;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/11/12/ 19:26 星期日<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>javaSE01<BR>
 */
public class Adapter extends Source implements ITargetable {
    @Override
    public void method2() {
        System.out.println("this is the targetable method");
    }
}
