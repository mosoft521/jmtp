package com.gmail.mosoft521.jmtp.ch01.project007T4;

/**
 * Created by Alvin on 2015/8/1.
 */
public class MyThread extends Thread {

    private int count = 14;

    @Override
    synchronized public void run() {
        super.run();
        count--;
        System.out.println("由 " + this.currentThread().getName() + " 计算，count=" + count);
    }
}
