package com.Patterns.patterns08.responsiblility;


/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/08/19/ 17:19 星期六<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>javaSE01<BR>
 */
public class MyHandler extends AbstractHandler implements IHandler {

    private String name;

    public MyHandler(String name) {
        this.name = name;
    }

    @Override
    public void operator() {
        System.out.println(name + "deal!");
        if (getHandler() != null) {
            getHandler().operator();
        }
    }
}
