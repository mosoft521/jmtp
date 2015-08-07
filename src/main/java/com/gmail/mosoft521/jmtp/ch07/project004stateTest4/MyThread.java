package com.gmail.mosoft521.jmtp.ch07.project004stateTest4;

public class MyThread extends Thread {

    @Override
    public void run() {
        try {
            synchronized (Lock.lock) {
                Lock.lock.wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}