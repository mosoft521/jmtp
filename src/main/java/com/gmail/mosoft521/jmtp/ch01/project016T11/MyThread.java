package com.gmail.mosoft521.jmtp.ch01.project016T11;

/**
 * Created by Alvin on 2015/8/1.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 500000; i++) {
            System.out.println("i=" + (i + 1));
        }
    }
}
