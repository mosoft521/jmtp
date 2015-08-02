package com.gmail.mosoft521.jmtp.ch02.project010synNotExtends;

public class MyThreadA extends Thread {

    private Sub sub;

    public MyThreadA(Sub sub) {
        super();
        this.sub = sub;
    }

    @Override
    public void run() {
        sub.serviceMethod();
    }
}