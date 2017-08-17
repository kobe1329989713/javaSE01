package com.Patterns.patterns08.bridge;

/**
 * Created by kobe on 2017/8/17.18:59
 * <br/>
 * Description:
 */
public class BridgeTest {
    public static void main(String[] args) {
        Bridge bridge = new MyBridge();

        // 1
        ISourceable sourceable01 = new SourceablImpl01();
        bridge.setSource(sourceable01);
        bridge.method();

        // 2
        ISourceable sourceable02 = new SourceablImpl02();
        bridge.setSource(sourceable02);
        bridge.method();
    }
}
