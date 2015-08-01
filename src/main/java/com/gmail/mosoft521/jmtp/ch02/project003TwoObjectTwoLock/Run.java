package com.gmail.mosoft521.jmtp.ch02.project003TwoObjectTwoLock;

public class Run {

    public static void main(String[] args) {

        HasSelfPrivateNum numRef1 = new HasSelfPrivateNum();
        HasSelfPrivateNum numRef2 = new HasSelfPrivateNum();

        ThreadA athread = new ThreadA(numRef1);
        athread.start();

        ThreadB bthread = new ThreadB(numRef2);
        bthread.start();

    }
}
/*
第一次:
b set over!
b num=200
a set over!
a num=100
第二次:
a set over!
b set over!
b num=200
a num=100
 */