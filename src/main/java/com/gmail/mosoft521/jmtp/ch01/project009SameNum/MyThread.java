package com.gmail.mosoft521.jmtp.ch01.project009SameNum;

public class MyThread extends Thread {
    private int i = 5;

    @Override
    public void run() {
        System.out.println("i=" + (i--) + " threadName=" + Thread.currentThread().getName());
    }
}