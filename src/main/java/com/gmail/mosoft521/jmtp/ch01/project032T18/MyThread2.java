package com.gmail.mosoft521.jmtp.ch01.project032T18;

public class MyThread2 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread2 run priority=" + this.getPriority());
    }
}
