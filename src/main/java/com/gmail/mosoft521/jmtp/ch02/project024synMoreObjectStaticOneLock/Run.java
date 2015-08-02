package com.gmail.mosoft521.jmtp.ch02.project024synMoreObjectStaticOneLock;

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
线程名称为：B在1438486033773进入printB
线程名称为：B在1438486033774离开printB
线程名称为：A在1438486033774进入printA
线程名称为：A在1438486036775离开printA
 */