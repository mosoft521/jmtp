package com.gmail.mosoft521.jmtp.ch07.project016threadCreateException;

public class Main2 {

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.setName("线程t1");
        t1.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("线程:" + t.getName() + " 出现了异常：");
                e.printStackTrace();
            }
        });
        t1.start();

        MyThread t2 = new MyThread();
        t2.setName("线程t2");
        t2.start();
    }
}
/*
Exception in thread "线程t2" java.lang.NullPointerException
	at com.gmail.mosoft521.jmtp.ch07.project016threadCreateException.MyThread.run(MyThread.java:7)
java.lang.NullPointerException
	at com.gmail.mosoft521.jmtp.ch07.project016threadCreateException.MyThread.run(MyThread.java:7)
线程:线程t1 出现了异常：
 */