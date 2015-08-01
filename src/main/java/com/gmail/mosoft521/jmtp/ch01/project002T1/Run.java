package com.gmail.mosoft521.jmtp.ch01.project002T1;


/**
 * Created by Alvin on 2015/8/1.
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("运行结束!");
    }
}
//运行结束!
//MyThread