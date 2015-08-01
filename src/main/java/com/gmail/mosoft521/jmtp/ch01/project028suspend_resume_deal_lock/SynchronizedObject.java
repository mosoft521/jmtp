package com.gmail.mosoft521.jmtp.ch01.project028suspend_resume_deal_lock;

/**
 * Created by Alvin on 2015/8/1.
 */
public class SynchronizedObject {
    synchronized public void printString() {
        System.out.println("begin");
        if (Thread.currentThread().getName().equals("a")) {
            System.out.println("a线程永远 suspend了！");
            Thread.currentThread().suspend();
        }
        System.out.println("end");
    }
}
