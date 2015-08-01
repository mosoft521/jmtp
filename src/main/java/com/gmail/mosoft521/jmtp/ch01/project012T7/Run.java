package com.gmail.mosoft521.jmtp.ch01.project012T7;

/**
 * Created by Alvin on 2015/8/1.
 */
public class Run {
    public static void main(String[] args) {
        MyThread mythread = new MyThread();
        System.out.println("begin ==" + mythread.isAlive());
        mythread.start();
        System.out.println("end ==" + mythread.isAlive());
    }
}
//begin ==false
//end ==true
//run=true