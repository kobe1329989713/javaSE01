package com.Patterns.patterns10.exersise01;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/08/26/ 18:44 星期六<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>javaSE01<BR>
 */
public class MySubject implements Subject {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitor(this);
    }

    @Override
    public String getSubject() {
        return "love";
    }
}
