package com.gmail.mosoft521.jmtp.ch02.project016T8;

public class Task {

    //    public void otherMethod() {
    synchronized public void otherMethod() {
        System.out.println("------------------------run--otherMethod");
    }

    public void doLongTimeTask() {
        synchronized (this) {
            for (int i = 0; i < 10000; i++) {
                System.out.println("synchronized threadName=" + Thread.currentThread().getName() + " i=" + (i + 1));
            }
        }

    }
}
