package com.gmail.mosoft521.jmtp.ch04.project023ReadWriteLockBegin4;

public class Run {

    public static void main(String[] args) throws InterruptedException {

        Service service = new Service();

        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();

        Thread.sleep(1000);

        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
    }
}
/*
获得写锁B 1438871300426
获得读锁A 1438871310426
 */