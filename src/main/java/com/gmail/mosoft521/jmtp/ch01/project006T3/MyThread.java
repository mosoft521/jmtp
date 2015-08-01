package com.gmail.mosoft521.jmtp.ch01.project006T3;

/**
 * Created by Alvin on 2015/8/1.
 */
public class MyThread extends Thread {

    private int count = 5;

    public MyThread(String name) {
        super();
        this.setName(name);
    }

    @Override
    public void run() {
        super.run();
        while (count > 0) {
            count--;
            System.out.println("由 " + this.currentThread().getName()
                    + " 计算，count=" + count);
        }
    }
}
