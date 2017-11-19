package com.patterns.patterns10.exersise01;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/08/26/ 18:42 星期六<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>javaSE01<BR>
 */
public class MyVisitor implements Visitor {
    @Override
    public void visitor(Subject sub) {
        System.out.println("visit the subject：===访问的主题" + sub.getSubject());
    }
}
