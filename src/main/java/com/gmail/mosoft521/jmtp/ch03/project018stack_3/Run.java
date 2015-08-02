package com.gmail.mosoft521.jmtp.ch03.project018stack_3;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyStack myStack = new MyStack();

        P p1 = new P(myStack);
        P p2 = new P(myStack);
        P p3 = new P(myStack);
        P p4 = new P(myStack);
        P p5 = new P(myStack);
        P p6 = new P(myStack);

        P_Thread pThread1 = new P_Thread(p1);
        P_Thread pThread2 = new P_Thread(p2);
        P_Thread pThread3 = new P_Thread(p3);
        P_Thread pThread4 = new P_Thread(p4);
        P_Thread pThread5 = new P_Thread(p5);
        P_Thread pThread6 = new P_Thread(p6);
        pThread1.start();
        pThread2.start();
        pThread3.start();
        pThread4.start();
        pThread5.start();
        pThread6.start();

        C c1 = new C(myStack);
        C_Thread cThread = new C_Thread(c1);
        cThread.start();
    }
}
/*
push=1
pop=0
push=1
pop=anyString=0.04080805398828169
pop=0
pop=anyString=0.0061521164892915925
pop操作中的：Thread-6 线程呈wait状态
push=1
pop=0
pop=anyString=0.2408858051035916
pop操作中的：Thread-6 线程呈wait状态
push=1
pop=0
pop=anyString=0.7413796031817864
push=1
pop=0
pop=anyString=0.34263549570061114
pop操作中的：Thread-6 线程呈wait状态
push=1
pop=0
pop=anyString=0.19544093744777646
pop操作中的：Thread-6 线程呈wait状态
push=1
pop=0
pop=anyString=0.9230904923942713
pop操作中的：Thread-6 线程呈wait状态
...
 */