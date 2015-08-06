package com.gmail.mosoft521.jmtp.ch04.project020ReadWriteLockBegin1;

public class ThreadA extends Thread {

    private Service service;

    public ThreadA(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.read();
    }
}