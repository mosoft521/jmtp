package com.gmail.mosoft521.jmtp.ch04.project006MustUseMoreCondition_OK;

public class ThreadB extends Thread {

    private MyService service;

    public ThreadB(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.awaitB();
    }
}