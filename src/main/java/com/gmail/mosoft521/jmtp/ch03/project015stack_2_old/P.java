package com.gmail.mosoft521.jmtp.ch03.project015stack_2_old;

public class P {

    private MyStack myStack;

    public P(MyStack myStack) {
        super();
        this.myStack = myStack;
    }

    public void pushService() {
        myStack.push();
    }
}