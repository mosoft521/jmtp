package com.gmail.mosoft521.jmtp.ch04.project020ReadWriteLockBegin1;

public class ThreadB extends Thread {

    private Service service;

    public ThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.read();
    }
}