package com.gmail.mosoft521.jmtp.ch01.project003RandomThread;

/**
 * Created by Alvin on 2015/8/1.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("run=" + Thread.currentThread().getName());
            }
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
