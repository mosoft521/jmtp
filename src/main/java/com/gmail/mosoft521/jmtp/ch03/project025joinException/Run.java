package com.gmail.mosoft521.jmtp.ch03.project025joinException;


public class Run {

    public static void main(String[] args) {

        try {
            ThreadB b = new ThreadB();
            b.start();

            Thread.sleep(500);

            ThreadC c = new ThreadC(b);
            c.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
/*
线程B在catch处打印了
java.lang.InterruptedException
	at java.lang.Object.wait(Native Method)
	at java.lang.Thread.join(Thread.java:1245)
	at java.lang.Thread.join(Thread.java:1319)
	at com.gmail.mosoft521.jmtp.ch03.project025joinException.ThreadB.run(ThreadB.java:10)
 */