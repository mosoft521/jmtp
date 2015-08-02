package com.gmail.mosoft521.jmtp.ch02.project035setNewPropertiesLockOne;

public class ThreadA extends Thread {

    private Service service;
    private Userinfo userinfo;

    public ThreadA(Service service,
                   Userinfo userinfo) {
        super();
        this.service = service;
        this.userinfo = userinfo;
    }

    @Override
    public void run() {
        service.serviceMethodA(userinfo);
    }
}