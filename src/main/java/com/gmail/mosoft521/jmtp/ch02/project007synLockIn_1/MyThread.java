package com.gmail.mosoft521.jmtp.ch02.project007synLockIn_1;

public class MyThread extends Thread {
    @Override
    public void run() {
        Service service = new Service();
        service.service1();
    }
}