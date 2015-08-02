package com.gmail.mosoft521.jmtp.ch02.project041atomicIntergerNoSafe;

public class MyThread extends Thread {
    private MyService mySerivce;

    public MyThread(MyService mySerivce) {
        super();
        this.mySerivce = mySerivce;
    }

    @Override
    public void run() {
        mySerivce.addNum();
    }
}
