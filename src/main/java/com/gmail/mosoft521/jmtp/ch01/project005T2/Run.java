package com.gmail.mosoft521.jmtp.ch01.project005T2;

public class Run {

    public static void main(String[] args) {
        Runnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("运行结束!");
    }
}
//运行结束!
//运行中!