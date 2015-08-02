package com.gmail.mosoft521.jmtp.ch02.project003TwoObjectTwoLock;

public class Run {

    public static void main(String[] args) {

        HasSelfPrivateNum numRef1 = new HasSelfPrivateNum();
        HasSelfPrivateNum numRef2 = new HasSelfPrivateNum();

        ThreadA athread = new ThreadA(numRef1);
        athread.setName("aThread");
        athread.start();

        ThreadB bthread = new ThreadB(numRef2);
        bthread.setName("bThread");
        bthread.start();

        System.out.println(Thread.currentThread().getName() + ":" + Thread.currentThread().getId());
    }
}
/*
第一次:
main:1
b set over!
b num=200
bThread:11
a set over!
a num=100
aThread:10
第二次:
a set over!
main:1
b set over!
b num=200
bThread:11
a num=100
aThread:10
 */