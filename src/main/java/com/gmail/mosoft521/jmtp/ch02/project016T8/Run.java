package com.gmail.mosoft521.jmtp.ch02.project016T8;

public class Run {

    public static void main(String[] args) throws InterruptedException {
        Task task = new Task();

        MyThread1 thread1 = new MyThread1(task);
        thread1.start();

        Thread.sleep(100);

        MyThread2 thread2 = new MyThread2(task);
        thread2.start();
    }
}
/*
>>无synchronized
synchronized threadName=Thread-0 i=1
synchronized threadName=Thread-0 i=2
...
synchronized threadName=Thread-0 i=3876
------------------------run--otherMethod
synchronized threadName=Thread-0 i=3877
...
synchronized threadName=Thread-0 i=10000
>>有synchronized
synchronized threadName=Thread-0 i=1
...
synchronized threadName=Thread-0 i=10000
------------------------run--otherMethod
 */