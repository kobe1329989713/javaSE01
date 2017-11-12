package com.Patterns.patterns01.exercise01.interpreter;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/10/04/ 18:22 星期三<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>javaSE01<BR>
 */
public class Plus implements IExpression {
    @Override
    public int interpreter(Context context) {
        return context.getNum1()+context.getNum2();
    }
}
