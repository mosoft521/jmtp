package com.gmail.mosoft521.jmtp.ch07.project004stateTest4;

public class Run {

    // NEW,
    // RUNNABLE,
    // TERMINATED,
    // BLOCKED,
    // WAITING,
    // TIMED_WAITING,

    public static void main(String[] args) {
        try {
            MyThread t = new MyThread();
            t.start();
            Thread.sleep(1000);
            System.out.println("main方法中的t状态：" + t.getState());
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
/*
main方法中的t状态：WAITING
Hold住?
 */