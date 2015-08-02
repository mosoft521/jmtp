package com.gmail.mosoft521.jmtp.ch02.project004synchronizedMethodLockObject;

public class ThreadA extends Thread {

    private MyObject object;

    public ThreadA(MyObject object) {
        super();
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        System.out.println("ThreadA.run(): " + this.getName());
        object.methodA();
    }
}
