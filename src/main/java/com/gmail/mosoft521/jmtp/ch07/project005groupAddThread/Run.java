package com.gmail.mosoft521.jmtp.ch07.project005groupAddThread;

public class Run {

    public static void main(String[] args) {
        ThreadA aRunnable = new ThreadA();
        ThreadB bRunnable = new ThreadB();

        ThreadGroup group = new ThreadGroup("Alvin的线程组");

        Thread aThread = new Thread(group, aRunnable);
        Thread bThread = new Thread(group, bRunnable);
        aThread.start();
        bThread.start();

        System.out.println("活动的线程数为：" + group.activeCount());
        System.out.println("线程组的名称为：" + group.getName());

    }
}
/*
活动的线程数为：2
线程组的名称为：Alvin的线程组
ThreadName=Thread-3
ThreadName=Thread-2
ThreadName=Thread-3
ThreadName=Thread-2
ThreadName=Thread-2
ThreadName=Thread-3
...
 */