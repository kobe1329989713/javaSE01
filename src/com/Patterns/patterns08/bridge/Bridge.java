package com.Patterns.patterns08.bridge;

/**
 * Created by kobe on 2017/8/17.18:56
 * <br/>
 * Description:
 *  ***
 */
public abstract class Bridge {
    private ISourceable source;

    public void method() {
        source.method();
    }

    public ISourceable getSource() {
        return source;
    }

    public void setSource(ISourceable source) {
        this.source = source;
    }
}
