package com.gmail.mosoft521.jmtp.ch02.project039volatileTestThread;

public class MyThread extends Thread {
    volatile public static int count;

    private static void addCount() {
//    synchronized private static void addCount() {
        for (int i = 0; i < 100; i++) {
            count++;
        }
        System.out.println("count=" + count);
    }

    @Override
    public void run() {
        addCount();
    }
}