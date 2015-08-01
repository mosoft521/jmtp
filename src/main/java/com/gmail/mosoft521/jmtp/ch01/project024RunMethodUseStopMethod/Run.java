package com.gmail.mosoft521.jmtp.ch01.project024RunMethodUseStopMethod;

/**
 * Created by Alvin on 2015/8/1.
 */
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