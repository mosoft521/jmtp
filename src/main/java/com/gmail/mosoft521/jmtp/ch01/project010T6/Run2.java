package com.gmail.mosoft521.jmtp.ch01.project010T6;

/**
 * Created by Alvin on 2015/8/1.
 */
public class Run2 {
    public static void main(String[] args) {
        MyThread mythread = new MyThread();
        mythread.start();
//        mythread.run();
    }
}
//版本一
//构造方法的打印：main
//run方法的打印：Thread-0
//版本二
//构造方法的打印：main
//run方法的打印：main