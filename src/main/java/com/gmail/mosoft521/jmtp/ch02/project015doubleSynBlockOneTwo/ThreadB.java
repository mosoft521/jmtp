package com.gmail.mosoft521.jmtp.ch02.project015doubleSynBlockOneTwo;

public class ThreadB extends Thread {
    private ObjectService service;

    public ThreadB(ObjectService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.serviceMethodB();
    }
}