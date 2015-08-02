package com.gmail.mosoft521.jmtp.ch02.project034setNewStringTwoLock;

public class ThreadB extends Thread {

    private MyService service;

    public ThreadB(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}