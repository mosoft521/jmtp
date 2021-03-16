package com.gmail.mosoft521.jmtp.ch04.project003z3_ok;

public class Run {

    public static void main(String[] args) {
        MyService myService = new MyService();
        MyThreadA a = new MyThreadA(myService);
        a.start();
    }
}
/*
A
...阻塞了...
 */