package com.gmail.mosoft521.jmtp.ch01.project015GetIdTest;

public class Test {
    public static void main(String[] args) {
        Thread runThread = Thread.currentThread();
        System.out.println(runThread.getName() + " " + runThread.getId());
    }
}
//main 1