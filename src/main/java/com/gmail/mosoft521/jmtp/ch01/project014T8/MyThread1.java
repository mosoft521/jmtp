package com.gmail.mosoft521.jmtp.ch01.project014T8;

public class MyThread1 extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("run threadName=" + this.currentThread().getName() + " begin");
            Thread.sleep(2000);
            System.out.println("run threadName=" + this.currentThread().getName() + " end");
        } catch (InterruptedException ie) {
            // TODO Auto-generated catch block
            ie.printStackTrace();
        }
    }
}