package com.gmail.mosoft521.jmtp.ch07.project016threadCreateException;

public class MyThread extends Thread {
    @Override
    public void run() {
        String username = null;
        System.out.println(username.hashCode());
    }
}