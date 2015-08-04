package com.gmail.mosoft521.jmtp.ch04.project002ConditionTestMoreMethod;

public class ThreadBB extends Thread {

    private MyService service;

    public ThreadBB(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.methodB();
    }
}