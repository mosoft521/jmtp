package com.gmail.mosoft521.jmtp.ch02.project033innerTest2;

import com.gmail.mosoft521.jmtp.ch02.project033innerTest2.OutClass.InnerClass1;
import com.gmail.mosoft521.jmtp.ch02.project033innerTest2.OutClass.InnerClass2;

public class Run {

    public static void main(String[] args) {
        final InnerClass1 in1 = new InnerClass1();
        final InnerClass2 in2 = new InnerClass2();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                in1.method1(in2);
            }
        }, "T1");
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                in1.method2();
            }
        }, "T2");
        // //
        // //
        Thread t3 = new Thread(new Runnable() {
            public void run() {
                in2.method1();
            }
        }, "T3");
        t1.start();
        t2.start();
        t3.start();
    }
}
/*
T3 进入InnerClass2类中的method1方法
k=0
T2 进入InnerClass1类中的method2方法
j=0
k=1
j=1
k=2
j=2
k=3
j=3
k=4
j=4
k=5
j=5
k=6
j=6
k=7
j=7
k=8
j=8
k=9
j=9
T3 离开InnerClass2类中的method1方法
T1 进入InnerClass1类中的method1方法
i=0
T2 离开InnerClass1类中的method2方法
i=1
i=2
i=3
i=4
i=5
i=6
i=7
i=8
i=9
T1 离开InnerClass1类中的method1方法
 */