package com.gmail.mosoft521.jmtp.ch01.project012T7;

/**
 * Created by Alvin on 2015/8/1.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("run=" + this.isAlive());
    }
}