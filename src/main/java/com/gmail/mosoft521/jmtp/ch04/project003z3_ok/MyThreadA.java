package com.gmail.mosoft521.jmtp.ch04.project003z3_ok;

public class MyThreadA extends Thread {

    private MyService myService;

    public MyThreadA(MyService myService) {
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.waitMethod();
    }
}