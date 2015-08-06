package com.gmail.mosoft521.jmtp.ch04.project020ReadWriteLockBegin1;

public class Run {

    public static void main(String[] args) {

        Service service = new Service();

        ThreadA a = new ThreadA(service);
        a.setName("A");

        ThreadB b = new ThreadB(service);
        b.setName("B");

        a.start();
        b.start();
    }
}
/*
获得读锁B 1438870884968
获得读锁A 1438870884974
 */