package com.gmail.mosoft521.jmtp.ch03.project016stack_2_new;

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