package com.gmail.mosoft521.jmtp.ch01.project012T7;

public class Run {
    public static void main(String[] args) {
        MyThread mythread = new MyThread();
        System.out.println("begin ==" + mythread.isAlive());
        mythread.start();
        System.out.println("end ==" + mythread.isAlive());
    }

//    public static void main(String[] args) throws InterruptedException {
//        MyThread mythread = new MyThread();
//        System.out.println("begin ==" + mythread.isAlive());
//        mythread.start();
//        Thread.sleep(1000);
//        System.out.println("end ==" + mythread.isAlive());
//    }
}
//ver1:
//begin ==false
//end ==true
//run=true

//ver2:
//begin ==false
//run=true
//end ==false