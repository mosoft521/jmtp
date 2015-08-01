package com.gmail.mosoft521.jmtp.ch01.project004Z;

/**
 * Created by Alvin on 2015/8/1.
 */
public class MyThread extends Thread {
    private int i;

    public MyThread(int i) {
        super();
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println(i);
    }
}
