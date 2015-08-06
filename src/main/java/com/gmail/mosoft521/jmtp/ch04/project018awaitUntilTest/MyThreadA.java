package com.gmail.mosoft521.jmtp.ch04.project018awaitUntilTest;

public class MyThreadA extends Thread {

    private Service service;

    public MyThreadA(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.waitMethod();
    }
}