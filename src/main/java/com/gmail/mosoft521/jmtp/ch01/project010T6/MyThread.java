package com.gmail.mosoft521.jmtp.ch01.project010T6;

/**
 * Created by Alvin on 2015/8/1.
 */
public class MyThread extends Thread {

    public MyThread() {
        System.out.println("构造方法的打印：" + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println("run方法的打印：" + Thread.currentThread().getName());
    }

}
