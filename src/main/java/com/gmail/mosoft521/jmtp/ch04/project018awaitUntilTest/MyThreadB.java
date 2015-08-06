package com.gmail.mosoft521.jmtp.ch04.project018awaitUntilTest;

public class MyThreadB extends Thread {

    private Service service;

    public MyThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.notifyMethod();
    }
}