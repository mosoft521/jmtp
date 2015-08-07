package com.gmail.mosoft521.jmtp.ch07.project003stateTest3;

public class MyThread2 extends Thread {

    @Override
    public void run() {
        MyService.serviceMethod();
    }
}