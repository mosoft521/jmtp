package com.gmail.mosoft521.jmtp.ch01.project017T12;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 5000000; i++) {
            System.out.println("i=" + (i + 1));
        }
    }
}