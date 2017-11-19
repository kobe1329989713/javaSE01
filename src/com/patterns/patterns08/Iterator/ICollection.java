package com.patterns.patterns08.Iterator;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/08/19/ 16:52 星期六<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>
 *
 *  迭代子模式 ,和 迭代器很像，jdk 已经实现好了，我们直接使用就好 Enumeration 也是，它也是
 *  jdk 里面已经实现好了，我们直接使用。就好。

 就是 迭代器 实现原理。

 * <BR>
 */
public interface ICollection {
    IIterator iterator();

    /*取得集合元素*/
    Object get(int i);

    /*取得集合大小*/
    int size();
}
