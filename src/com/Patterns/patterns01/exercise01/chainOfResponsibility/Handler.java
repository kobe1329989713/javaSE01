package com.Patterns.patterns01.exercise01.chainOfResponsibility;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/10/04/ 16:53 星期三<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>责任链模式。
 *
 *  一个请求 传 传 到  a b c d e  这些对象之间，形成一个链条，
 *      不知是 a b c d e 哪个对象会最终来处理这个请求。
 *
 * <BR>
 */
public interface Handler {
    void operator();
}
