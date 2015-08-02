package com.gmail.mosoft521.jmtp.ch02.project012synchronizedOneThreadIn;

public class ThreadA extends Thread {

    private ObjectService service;

    public ThreadA(ObjectService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.serviceMethod();
    }
}
