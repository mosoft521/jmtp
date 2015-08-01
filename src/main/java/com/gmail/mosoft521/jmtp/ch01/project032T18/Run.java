package com.gmail.mosoft521.jmtp.ch01.project032T18;


public class Run {
    public static void main(String[] args) {
        System.out.println("main thread begin priority=" + Thread.currentThread().getPriority());
//        Thread.currentThread().setPriority(6);
        System.out.println("main thread end   priority=" + Thread.currentThread().getPriority());
        MyThread1 thread1 = new MyThread1();
        thread1.start();
    }
}
/*
有注释:
main thread begin priority=5
main thread end   priority=5
MyThread1 run priority=5
MyThread2 run priority=5
去掉注释:
main thread begin priority=5
main thread end   priority=6
MyThread1 run priority=6
MyThread2 run priority=6
 */