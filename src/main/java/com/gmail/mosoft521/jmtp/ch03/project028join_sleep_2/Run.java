package com.gmail.mosoft521.jmtp.ch03.project028join_sleep_2;

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
   b run begin timer=1438696388920
打印了bService timer=1438696389921
   b run   end timer=1438696393921
 */