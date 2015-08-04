package com.gmail.mosoft521.jmtp.ch04.project004UseConditionWaitNotifyOK;

public class Run {

    public static void main(String[] args) throws InterruptedException {

        MyService service = new MyService();

        ThreadA a = new ThreadA(service);
        a.start();

        Thread.sleep(3000);

        service.signal();
    }
}
/*
 await时间为1438698562208
signal时间为1438698565209
 */