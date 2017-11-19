package com.patterns.patterns01.exercise02.bridge;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/11/12/ 23:33 星期日<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>javaSE01<BR>
 */
public class SourceImpl implements ISourceable {
    @Override
    public void method() {
        System.out.println("the is first method");
    }
}
