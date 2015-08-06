package com.gmail.mosoft521.jmtp.ch02.project004synchronizedMethodLockObject;

public class ThreadB extends Thread {

    private MyObject object;

    public ThreadB(MyObject object) {
        super();
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        System.out.println("ThreadB.run(): " + this.getName());
        object.methodA();
    }
}