package com.gmail.mosoft521.jmtp.ch07.project001StateTest1;

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
            System.out.println("main方法中的状态1：" + t.getState());
            Thread.sleep(1000);
            t.start();
            Thread.sleep(1000);
            System.out.println("main方法中的状态2：" + t.getState());
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
/*
构造方法中的状态: RUNNABLE
main方法中的状态1：NEW
run方法中的状态: RUNNABLE
main方法中的状态2：TERMINATED
 */