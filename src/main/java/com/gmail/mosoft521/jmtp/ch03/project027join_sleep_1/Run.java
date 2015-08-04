package com.gmail.mosoft521.jmtp.ch03.project027join_sleep_1;

public class Run {

    public static void main(String[] args) {

        try {
            ThreadB b = new ThreadB();

            ThreadA a = new ThreadA(b);
            a.start();

            Thread.sleep(1000);

            ThreadC c = new ThreadC(b);
            c.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
/*
   b run begin timer=1438696109510
   b run   end timer=1438696114510
打印了bService timer=1438696115510
 */