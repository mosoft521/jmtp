package com.gmail.mosoft521.jmtp.ch02.project021synchronizedBlockLockAll.test1;

public class Run1_1 {

    public static void main(String[] args) {
        Service service = new Service();
        MyObject object = new MyObject();

        ThreadA a = new ThreadA(service, object);
        a.setName("a");
        a.start();

        ThreadB b = new ThreadB(service, object);
        b.setName("b");
        b.start();
    }
}
/*
testMethod1 ____getLock time=1438484657432 run ThreadName=a
testMethod1 releaseLock time=1438484659432 run ThreadName=a
testMethod1 ____getLock time=1438484659432 run ThreadName=b
testMethod1 releaseLock time=1438484661432 run ThreadName=b
 */