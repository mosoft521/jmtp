package com.gmail.mosoft521.jmtp.ch02.project028TwoStop;

public class Service {
    Object object1 = new Object();
    Object object2 = new Object();

    //同步方法
//    synchronized public void methodA() {
//        System.out.println("methodA begin");
//        boolean isContinueRun = true;
//        while (isContinueRun) {
//        }
//        System.out.println("methodA end");
//    }
//
//    synchronized public void methodB() {
//        System.out.println("methodB begin");
//        System.out.println("methodB end");
//    }

    //同步块:
    public void methodA() {
        synchronized (object1) {
            System.out.println("methodA begin");
            boolean isContinueRun = true;
            while (isContinueRun) {
            }
            System.out.println("methodA end");
        }
    }

    public void methodB() {
        synchronized (object2) {
            System.out.println("methodB begin");
            System.out.println("methodB end");
        }
    }
}
