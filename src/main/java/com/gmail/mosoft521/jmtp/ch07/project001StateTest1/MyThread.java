package com.gmail.mosoft521.jmtp.ch07.project001StateTest1;

/**
 * Created by Alvin on 2015/8/1.
 */
public class MyThread extends Thread {
    public MyThread() {
        System.out.println("构造方法中的状态: " + Thread.currentThread().getState());
    }

    @Override
    public void run() {
        System.out.println("run方法中的状态: " + Thread.currentThread().getState());
    }
}