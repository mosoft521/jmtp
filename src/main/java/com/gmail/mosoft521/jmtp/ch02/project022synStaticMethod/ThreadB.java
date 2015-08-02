package com.gmail.mosoft521.jmtp.ch02.project022synStaticMethod;

public class ThreadB extends Thread {
    @Override
    public void run() {
        Service.printB();
    }
}