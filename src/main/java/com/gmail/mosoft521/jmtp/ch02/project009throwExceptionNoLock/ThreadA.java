package com.gmail.mosoft521.jmtp.ch02.project009throwExceptionNoLock;

public class ThreadA extends Thread {

    private Service service;

    public ThreadA(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}