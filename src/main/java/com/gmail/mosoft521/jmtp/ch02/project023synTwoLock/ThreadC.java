package com.gmail.mosoft521.jmtp.ch02.project023synTwoLock;

public class ThreadC extends Thread {

    private Service service;

    public ThreadC(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.printC();
    }
}