package com.gmail.mosoft521.jmtp.ch02.project008synLockIn_2;

public class MyThread extends Thread {
    @Override
    public void run() {
        Sub sub = new Sub();
        sub.operateISubMethod();
    }
}
