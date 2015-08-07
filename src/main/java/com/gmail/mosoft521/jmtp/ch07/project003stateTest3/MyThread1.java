package com.gmail.mosoft521.jmtp.ch07.project003stateTest3;

public class MyThread1 extends Thread {

    @Override
    public void run() {
        MyService.serviceMethod();
    }
}