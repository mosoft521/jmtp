package com.gmail.mosoft521.jmtp.ch02.project021synchronizedBlockLockAll.test1;

public class Run1_2 {

    public static void main(String[] args) {
        Service service = new Service();
        MyObject object1 = new MyObject();
        MyObject object2 = new MyObject();

        ThreadA a = new ThreadA(service, object1);
        a.setName("a");
        a.start();

        ThreadB b = new ThreadB(service, object2);
        b.setName("b");
        b.start();
    }
}
/*
testMethod1 ____getLock time=1438484676379 run ThreadName=a
testMethod1 ____getLock time=1438484676380 run ThreadName=b
testMethod1 releaseLock time=1438484678379 run ThreadName=a
testMethod1 releaseLock time=1438484678380 run ThreadName=b
 */