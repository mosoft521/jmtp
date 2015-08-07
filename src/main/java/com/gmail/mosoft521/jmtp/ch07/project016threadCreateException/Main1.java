package com.gmail.mosoft521.jmtp.ch07.project016threadCreateException;

public class Main1 {

    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
/*
Exception in thread "Thread-0" java.lang.NullPointerException
	at com.gmail.mosoft521.jmtp.ch07.project016threadCreateException.MyThread.run(MyThread.java:7)
 */