package com.gmail.mosoft521.jmtp.ch02.project014T7;

public class Task {

    public void doLongTimeTask() {
        for (int i = 0; i < 10; i++) {
            System.out.println("NOSYnchronized threadName=" + Thread.currentThread().getName() + " i=" + (i + 1));
        }
        System.out.println("");
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                System.out.println("SYNChronized threadName=" + Thread.currentThread().getName() + " i=" + (i + 1));
            }
        }

    }
}