package com.gmail.mosoft521.jmtp.ch06.singleton_3;

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println(MyObject.getInstance().hashCode());
    }
}