package com.gmail.mosoft521.jmtp.ch06.singleton_10;

public class Run {

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.start();
        t2.start();
        t3.start();
    }
}
/*
调用了MyObject的构造
1868641623
1868641623
1868641623
1868641623
1868641623
1868641623
1868641623
1868641623
1868641623
1868641623
1868641623
1868641623
1868641623
1868641623
1868641623
 */