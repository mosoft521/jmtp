package com.gmail.mosoft521.jmtp.ch07.project003stateTest3;

public class Run {

    // NEW,
    // RUNNABLE,
    // TERMINATED,
    // BLOCKED,
    // WAITING,
    // TIMED_WAITING,

    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        t1.setName("a");
        t1.start();
        MyThread2 t2 = new MyThread2();
        t2.setName("b");
        t2.start();
        System.out.println("main方法中的t2状态：" + t2.getState());
    }
}
/*
main方法中的t2状态：RUNNABLE
a进入了业务方法！
b进入了业务方法！
 */