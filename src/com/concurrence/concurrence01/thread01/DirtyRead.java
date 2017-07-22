package com.concurrence.concurrence01.thread01;

/**
 * Created by kobe on 2017/7/21.22:04
 * <br/>
 * Description:
 */
public class DirtyRead {
    private String username = "kobe";
    private String password = "123";

    public synchronized void setValue(String username, String password) {
        this.username = username;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.password = password;
        System.out.println("setValue结果是：username = " + username + "，" + "，password = " + password);
    }

    public synchronized void getValue() {
        System.out.println("getValue结果是：username = " + this.username + "，password = " + this.password);
    }

    public static void main(String[] args) throws InterruptedException {
        final DirtyRead dr = new DirtyRead();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                dr.setValue("mar","456");
            }
        });
        t1.start();
        Thread.sleep(1000);

        dr.getValue();
    }
}
