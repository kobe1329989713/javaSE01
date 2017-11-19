package com.patterns.patterns01.exercise01.iterator;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/10/04/ 16:33 星期三<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>javaSE01<BR>
 */
public interface Iterator {

    //前移
    Object previous();

    //后移
    public Object next();
    boolean hasNext();

    //取得第一个元素
    Object first();
}
