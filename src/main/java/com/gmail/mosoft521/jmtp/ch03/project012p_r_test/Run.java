package com.gmail.mosoft521.jmtp.ch03.project012p_r_test;

public class Run {

    public static void main(String[] args) {

        String lock = new String("");
        P p = new P(lock);
        C c = new C(lock);

        ThreadP pThread = new ThreadP(p);
        ThreadC cThread = new ThreadC(c);

        pThread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        cThread.start();
    }
}
/*
...
set的值是1438523891574_4317403386377
get的值是1438523891574_4317403386377
set的值是1438523892601_4318429996055
get的值是1438523892601_4318429996055
...
 */