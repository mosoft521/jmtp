package com.gmail.mosoft521.jmtp.ch01.project024RunMethodUseStopMethod;

public class Run {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
/*
进入了catch()方法！
java.lang.ThreadDeath
	at java.lang.Thread.stop(Thread.java:836)
	at com.gmail.mosoft521.jmtp.ch01.project024RunMethodUseStopMethod.MyThread.run(MyThread.java:10)
 */