package com.patterns.patterns08.Iterator;


/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/08/19/ 16:59 星期六<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>javaSE01<BR>
 */
public class MyCollection implements ICollection {

    public String string[] = {"A", "B", "C", "D", "E"};

    @Override
    public IIterator iterator() {
        return new MyIterator(this);
    }

    @Override
    public Object get(int i) {
        return string[i];
    }

    @Override
    public int size() {
        return string.length;
    }
}
