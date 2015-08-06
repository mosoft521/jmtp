package com.gmail.mosoft521.jmtp.ch04.project022ReadWriteLockBegin3;

public class Run {

    public static void main(String[] args) throws InterruptedException {

        Service service = new Service();

        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();

        Thread.sleep(1000);

        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
    }
}
/*
获得读锁A 1438871168872
获得写锁B 1438871178873
 */