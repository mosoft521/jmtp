package com.gmail.mosoft521.jmtp.ch02.project002T2;

public class Run {

    public static void main(String[] args) {

        HasSelfPrivateNum numRef = new HasSelfPrivateNum();

        ThreadA athread = new ThreadA(numRef);
        athread.start();

        ThreadB bthread = new ThreadB(numRef);
        bthread.start();
    }
}
/*
无synchronized:
a set over!
b set over!
b num=200
a num=200
有synchronized:
b set over!
b num=200
a set over!
a num=100
 */