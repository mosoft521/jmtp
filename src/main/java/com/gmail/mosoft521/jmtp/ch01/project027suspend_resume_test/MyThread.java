package com.gmail.mosoft521.jmtp.ch01.project027suspend_resume_test;

/**
 * Created by Alvin on 2015/8/1.
 */
public class MyThread extends Thread {
    private long i = 0;

    public long getI() {
        return i;
    }

    public void setI(long i) {
        this.i = i;
    }

    @Override
    public void run() {
        while (true) {
            i++;
        }
    }
}
