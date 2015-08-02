package com.gmail.mosoft521.jmtp.ch02.project015doubleSynBlockOneTwo;

public class Run {

    public static void main(String[] args) {
        ObjectService service = new ObjectService();

        ThreadA a = new ThreadA(service);
        a.setName("a");
        a.start();

        ThreadB b = new ThreadB(service);
        b.setName("b");
        b.start();
    }
}
/*
第一次:
B begin time=1438481058650
B end    end=1438481058650
A begin time=1438481058650
A end    end=1438481060650
第二次:
A begin time=1438481097861
A end    end=1438481099861
B begin time=1438481099861
B end    end=1438481099861
 */