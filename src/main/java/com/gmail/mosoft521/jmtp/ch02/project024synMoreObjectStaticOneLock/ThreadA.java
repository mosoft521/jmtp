package com.gmail.mosoft521.jmtp.ch02.project024synMoreObjectStaticOneLock;

public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.printA();
    }
}