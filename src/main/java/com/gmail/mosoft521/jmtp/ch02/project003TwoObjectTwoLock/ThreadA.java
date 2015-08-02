package com.gmail.mosoft521.jmtp.ch02.project003TwoObjectTwoLock;

public class ThreadA extends Thread {

    private HasSelfPrivateNum numRef;

    public ThreadA(HasSelfPrivateNum numRef) {
        super();
        this.numRef = numRef;
    }

    @Override
    public void run() {
        super.run();
        numRef.addI("a");
        System.out.println(this.getName() + ":" + this.getId());
    }
}
