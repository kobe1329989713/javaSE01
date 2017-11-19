package com.patterns.patterns01.exercise01.state;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/10/04/ 17:45 星期三<BR>
 * <p>
 * <B>系统名称：</B>javaSE01<BR>
 * <B>概要说明：</B>javaSE01<BR>
 */
public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void method() {
        if (state.getValue().equals("state1")) {
            state.method01();
        } else if (state.getValue().equals("state2")) {
            state.method02();
        }
    }
}
