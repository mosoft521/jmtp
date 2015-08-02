package com.gmail.mosoft521.jmtp.ch02.project010synNotExtends;

public class MyThreadB extends Thread {

    private Sub sub;

    public MyThreadB(Sub sub) {
        super();
        this.sub = sub;
    }

    @Override
    public void run() {
        sub.serviceMethod();
    }
}