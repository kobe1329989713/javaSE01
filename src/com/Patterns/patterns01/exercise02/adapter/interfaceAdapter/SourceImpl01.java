package com.Patterns.patterns01.exercise02.adapter.interfaceAdapter;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/11/12/ 19:43 星期日<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>javaSE01<BR>
 */
public class SourceImpl01 extends WrapperImpl {

    @Override
    public void method1() {
        System.out.println("the sourceable interface's first sub1");
    }
}
