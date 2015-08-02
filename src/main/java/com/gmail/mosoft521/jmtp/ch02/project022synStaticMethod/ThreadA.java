package com.gmail.mosoft521.jmtp.ch02.project022synStaticMethod;

public class ThreadA extends Thread {
    @Override
    public void run() {
        Service.printA();
    }
}