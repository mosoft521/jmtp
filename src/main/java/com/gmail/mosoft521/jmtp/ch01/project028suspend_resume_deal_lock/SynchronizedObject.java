package com.gmail.mosoft521.jmtp.ch01.project028suspend_resume_deal_lock;

public class SynchronizedObject {
    synchronized public void printString() {
        System.out.println(Thread.currentThread().getName() + " begin");
        if (Thread.currentThread().getName().equals("a")) {
            System.out.println("a线程永远 suspend了！");
            Thread.currentThread().suspend();
        }
        System.out.println(Thread.currentThread().getName() + " end");
    }
}