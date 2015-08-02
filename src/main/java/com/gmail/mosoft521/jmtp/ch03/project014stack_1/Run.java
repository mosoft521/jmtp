package com.gmail.mosoft521.jmtp.ch03.project014stack_1;

public class Run {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();

        P p = new P(myStack);
        C c = new C(myStack);

        P_Thread pThread = new P_Thread(p);
        C_Thread cThread = new C_Thread(c);
        pThread.start();
        cThread.start();
    }
}
/*
push=1
pop=0
pop=anyString=0.6703580480177975
push=1
pop=0
pop=anyString=0.4119163124812074
push=1
pop=0
pop=anyString=0.8024196372754133
...
 */