package com.javaSE.concurrent;

/**
 * @Author:Administrator
 * @Date:2017/5/7 14:30
 */
public class User {
    private String name;
    // 注：它volatile
    volatile int score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
