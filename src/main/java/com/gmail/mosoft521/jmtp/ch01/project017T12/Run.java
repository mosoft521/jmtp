package com.gmail.mosoft521.jmtp.ch01.project017T12;

/**
 * Created by Alvin on 2015/8/1.
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(10000);
            thread.interrupt();
//            Thread.currentThread().interrupt();
            System.out.println("是否停止1？=" + thread.interrupted());
            System.out.println("是否停止2？=" + thread.interrupted());
            System.out.println();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
/*
停止不了
 */