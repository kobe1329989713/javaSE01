package com.Patterns.patterns01.exercise01.interpreter;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/10/04/ 18:21 星期三<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>
 *
 *  关联
 *      组合：整体没有了，部分也是没有了。公司与部门。
 *      聚合：整体没有了，部分还可以存在的。如：公司与员工
 *      
 * <BR>
 */
public class Context {
    private int num1;
    private int num2;

    public Context(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}
