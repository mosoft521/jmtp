package com.gmail.mosoft521.jmtp.ch07.project017threadGroup_1;

public class Run {

    public static void main(String[] args) {
        ThreadGroup group = new ThreadGroup("我的线程组");
        MyThread[] myThread = new MyThread[10];
        for (int i = 0; i < myThread.length; i++) {
            myThread[i] = new MyThread(group, "线程" + (i + 1), "1");
            myThread[i].start();
        }
        MyThread newT = new MyThread(group, "报错线程", "a");
        newT.start();
    }
}
/*
死循环中：线程1
死循环中：线程1
死循环中：线程9
死循环中：线程1
Exception in thread "报错线程" 死循环中：线程9
死循环中：线程1
死循环中：线程1
死循环中：线程9
死循环中：线程2
死循环中：线程10
死循环中：线程9
死循环中：线程1
java.lang.NumberFormatException: For input string: "a"
	at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
	at java.lang.Integer.parseInt(Integer.java:580)
	at java.lang.Integer.parseInt(Integer.java:615)
	at com.gmail.mosoft521.jmtp.ch07.project017threadGroup_1.MyThread.run(MyThread.java:14)
死循环中：线程2
死循环中：线程1
死循环中：线程7
死循环中：线程8
...
 */