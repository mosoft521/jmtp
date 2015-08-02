package com.gmail.mosoft521.jmtp.ch02.project023synTwoLock;

public class Run {

    public static void main(String[] args) {

        Service service = new Service();

        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();

        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();

        ThreadC c = new ThreadC(service);
        c.setName("C");
        c.start();

    }
}
/*
线程名称为：A在1438485609934进入printA
线程名称为：C在1438485609936进入printC
线程名称为：C在1438485609936离开printC
线程名称为：A在1438485612935离开printA
线程名称为：B在1438485612935进入printB
线程名称为：B在1438485612935离开printB
 */