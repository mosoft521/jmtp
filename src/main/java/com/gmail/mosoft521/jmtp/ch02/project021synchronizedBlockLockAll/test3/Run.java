package com.gmail.mosoft521.jmtp.ch02.project021synchronizedBlockLockAll.test3;

public class Run {

    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        MyObject object = new MyObject();

        ThreadA a = new ThreadA(service, object);
        a.setName("a");
        a.start();

        Thread.sleep(100);

        ThreadB b = new ThreadB(object);
        b.setName("b");
        b.start();
    }
}
/*
testMethod1 ____getLock time=1438485199605 run ThreadName=a
testMethod1 releaseLock time=1438485204606 run ThreadName=a
speedPrintString ____getLock time=1438485204606 run ThreadName=b
-----------------
speedPrintString releaseLock time=1438485204606 run ThreadName=b
 */