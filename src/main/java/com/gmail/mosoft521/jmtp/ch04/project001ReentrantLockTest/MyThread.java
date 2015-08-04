package com.gmail.mosoft521.jmtp.ch04.project001ReentrantLockTest;

public class MyThread extends Thread {

    private MyService service;

    public MyThread(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}