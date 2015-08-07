package com.gmail.mosoft521.jmtp.ch07.project002stateTest2;

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
            System.out.println("main方法中的状态：" + t.getState());
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
/*
begin sleep
main方法中的状态：TIMED_WAITING
  end sleep
 */