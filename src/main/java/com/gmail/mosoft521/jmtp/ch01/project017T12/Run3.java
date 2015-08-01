package com.gmail.mosoft521.jmtp.ch01.project017T12;

/**
 * Created by Alvin on 2015/8/1.
 */
public class Run3 {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.interrupt();
            System.out.println("是否停止1？=" + thread.isInterrupted());
            System.out.println("是否停止2？=" + thread.isInterrupted());
            System.out.println("是否停止3？=" + thread.isInterrupted());
            System.out.println("是否停止4？=" + thread.isInterrupted());
            System.out.println("是否停止5？=" + thread.isInterrupted());
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
/*
i=1
i=2
...
i=500000
 */