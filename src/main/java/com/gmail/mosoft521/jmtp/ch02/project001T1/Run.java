package com.gmail.mosoft521.jmtp.ch02.project001T1;

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
a set over!
b set over!
a num = 100
b num = 200
 */