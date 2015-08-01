package com.gmail.mosoft521.jmtp.ch01.project009SameNum;

/**
 * Created by Alvin on 2015/8/1.
 */
public class Run {

    public static void main(String[] args) {

        MyThread run = new MyThread();

        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        Thread t3 = new Thread(run);
        Thread t4 = new Thread(run);
        Thread t5 = new Thread(run);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
//i=5 threadName=Thread-2
//i=4 threadName=Thread-1
//i=3 threadName=Thread-3
//i=2 threadName=Thread-5
//i=1 threadName=Thread-4