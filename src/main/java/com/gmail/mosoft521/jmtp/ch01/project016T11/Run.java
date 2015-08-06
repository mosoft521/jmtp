package com.gmail.mosoft521.jmtp.ch01.project016T11;

public class Run {

    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(2000);
            thread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
    }
}
/*
i=1
i=2
...
i=500000
 */