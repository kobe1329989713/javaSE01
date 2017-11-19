package com.patterns.patterns01.exercise01.visitor;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/10/04/ 17:56 星期三<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>javaSE01<BR>
 */
public interface ISubject {
    void accept(IVisitor visitor);

    String getSubject();
}
