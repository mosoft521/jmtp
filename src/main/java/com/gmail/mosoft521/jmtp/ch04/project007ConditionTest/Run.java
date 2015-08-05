package com.gmail.mosoft521.jmtp.ch04.project007ConditionTest;

public class Run {

    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();

        MyThreadA a = new MyThreadA(myService);
        a.start();

        MyThreadB b = new MyThreadB(myService);
        b.start();
    }
}
/*
打印★
打印☆
打印★
打印☆
打印★
...
 */