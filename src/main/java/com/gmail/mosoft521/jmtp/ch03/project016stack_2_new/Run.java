package com.gmail.mosoft521.jmtp.ch03.project016stack_2_new;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyStack myStack = new MyStack();

        P p = new P(myStack);

        C r1 = new C(myStack);
        C r2 = new C(myStack);
        C r3 = new C(myStack);
        C r4 = new C(myStack);
        C r5 = new C(myStack);

        P_Thread pThread = new P_Thread(p);
        pThread.start();

        C_Thread cThread1 = new C_Thread(r1);
        C_Thread cThread2 = new C_Thread(r2);
        C_Thread cThread3 = new C_Thread(r3);
        C_Thread cThread4 = new C_Thread(r4);
        C_Thread cThread5 = new C_Thread(r5);
        cThread1.start();
        cThread2.start();
        cThread3.start();
        cThread4.start();
        cThread5.start();
    }
}
/*
pop操作中的：Thread-1 线程呈wait状态
pop操作中的：Thread-3 线程呈wait状态
pop操作中的：Thread-2 线程呈wait状态
pop操作中的：Thread-5 线程呈wait状态
push=1
pop=0
pop=anyString=0.5961915263723685
pop操作中的：Thread-4 线程呈wait状态
pop操作中的：Thread-1 线程呈wait状态
pop操作中的：Thread-3 线程呈wait状态
Hold住(假死)
 */