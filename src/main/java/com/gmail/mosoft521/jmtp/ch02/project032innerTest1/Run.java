package com.gmail.mosoft521.jmtp.ch02.project032innerTest1;

public class Run {
    public static void main(String[] args) {

        final OutClass.Inner inner = new OutClass.Inner();

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                inner.method1();
            }
        }, "A");

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                inner.method2();
            }
        }, "B");

        t1.start();
        t2.start();
    }
}
/*
B i=11
A i=1
B i=12
A i=2
A i=3
B i=13
A i=4
B i=14
B i=15
A i=5
B i=16
A i=6
B i=17
A i=7
B i=18
A i=8
B i=19
A i=9
B i=20
A i=10
 */