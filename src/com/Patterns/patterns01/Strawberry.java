package com.Patterns.patterns01;

/**
 * 具体水果类，1
 */
public class Strawberry implements IFruit {

    // 苹果树的年龄。
    private int treeAge;
    @Override
    public void grow() {
        log("苹果树的年龄+grow");
    }

    @Override
    public void harvest() {
        log("苹果树的收获+harvest");
    }

    @Override
    public void plant() {
        log("苹果树的种植+plant");
    }

    public void log(String msg) {
        System.out.println(msg+"完全快递费xxllll");
    }

    public int getTreeAge() {
        return treeAge;
    }

    public void setTreeAge(int treeAge) {
        this.treeAge = treeAge;
    }
}
