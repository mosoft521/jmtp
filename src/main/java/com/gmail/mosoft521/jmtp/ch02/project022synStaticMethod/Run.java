package com.gmail.mosoft521.jmtp.ch02.project022synStaticMethod;

public class Run {

    public static void main(String[] args) {

        ThreadA a = new ThreadA();
        a.setName("A");
        a.start();

        ThreadB b = new ThreadB();
        b.setName("B");
        b.start();
    }
}
/*
线程名称为：A在1438485417401进入printA
线程名称为：A在1438485420401离开printA
线程名称为：B在1438485420401进入printB
线程名称为：B在1438485420401离开printB
 */