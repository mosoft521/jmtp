package com.gmail.mosoft521.jmtp.ch03.project003Test2;

public class Test {
    public static void main(String[] args) {
        try {
            Object lock = new Object();

            MyThread1 t1 = new MyThread1(lock);
            t1.start();

            Thread.sleep(3000);

            MyThread2 t2 = new MyThread2(lock);
            t2.start();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
/*
开始      wait time=1438503978138
开始notify time=1438503981139
结束notify time=1438503981139
结束      wait time=1438503981139
 */