package com.patterns.patterns08.Iterator;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/08/19/ 16:57 星期六<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>javaSE01<BR>
 */
public interface IIterator {
    // 前移。
    Object previous();

    // 后移
    Object next();

    boolean hasNext();

    // 取得第一元素。
    Object first();
}
