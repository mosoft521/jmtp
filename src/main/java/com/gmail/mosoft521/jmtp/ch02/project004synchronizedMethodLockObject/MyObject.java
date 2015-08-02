package com.gmail.mosoft521.jmtp.ch02.project004synchronizedMethodLockObject;

public class MyObject {

    public void methodA() {
//    synchronized public void methodA() {
        try {
            System.out.println("begin methodA threadName=" + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("MyObject.methodA() end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
