package com.gmail.mosoft521.jmtp.ch04.project021ReadWriteLockBegin2;

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
>>第一次：
获得写锁B 1438871041626
获得写锁A 1438871051627
>>第二次：
获得写锁A 1615864632433
获得写锁B 1615864642434
 */