package com.Patterns.patterns08.responsiblility;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/08/19/ 17:22 星期六<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>
 *
 *  第一个体系：就相当于是一个 javaBean 样。 getXxx() setXxx()
 *
 *  第二体系：重点。
 *
 * <BR>
 */
@SuppressWarnings("ALL")
public class TestHandler {

    public static void main(String[] args) {
        MyHandler h1 = new MyHandler("h1");
        MyHandler h2 = new MyHandler("h2");
        MyHandler h3 = new MyHandler("h3");

        h1.setHandler(h2);
        h2.setHandler(h3);

        h1.operator();
    }
}
