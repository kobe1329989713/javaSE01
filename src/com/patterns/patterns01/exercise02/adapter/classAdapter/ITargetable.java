package com.patterns.patterns01.exercise02.adapter.classAdapter;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/11/12/ 19:26 星期日<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>javaSE01<BR>
 */
public interface ITargetable {

    /* 与原类中的方法相同 */
    public void method1();

    /* 新类的方法 */
    public void method2();
//    这样Targetable接口的实现类就具有了Source类的功能。 ？？？？？？

}
