package com.gmail.mosoft521.jmtp.ch04.project016awaitUninterruptiblyTest_1;

public class MyThread extends Thread {

    private Service service;

    public MyThread(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}