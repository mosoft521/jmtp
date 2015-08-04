package com.gmail.mosoft521.jmtp.ch03.project026joinLong;

public class MyThread extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("begin Timer=" + System.currentTimeMillis());
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}