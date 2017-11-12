package com.Patterns.patterns01.exercise01.iterator;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/10/04/ 16:33 星期三<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>javaSE01<BR>
 */
public interface Collection {
    Iterator iterator();

    Object get(int i);

    int size();
}
