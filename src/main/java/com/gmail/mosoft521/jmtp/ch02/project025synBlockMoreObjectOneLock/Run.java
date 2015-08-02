package com.gmail.mosoft521.jmtp.ch02.project025synBlockMoreObjectOneLock;

public class Run {

    public static void main(String[] args) {

        Service service1 = new Service();
        Service service2 = new Service();

        ThreadA a = new ThreadA(service1);
        a.setName("A");
        a.start();

        ThreadB b = new ThreadB(service2);
        b.setName("B");
        b.start();
    }
}
/*
线程名称为：A在1438486456154进入printA
线程名称为：A在1438486459155离开printA
线程名称为：B在1438486459155进入printB
线程名称为：B在1438486459155离开printB
 */