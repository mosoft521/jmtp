package com.gmail.mosoft521.jmtp.ch03.project014stack_1;

public class Run {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();

        P p = new P(myStack);
        C r = new C(myStack);

        P_Thread pThread = new P_Thread(p);
        C_Thread rThread = new C_Thread(r);
        pThread.start();
        rThread.start();
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