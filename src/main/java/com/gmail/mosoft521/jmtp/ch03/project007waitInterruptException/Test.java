package com.gmail.mosoft521.jmtp.ch03.project007waitInterruptException;

public class Test {

    public static void main(String[] args) {

        try {
            Object lock = new Object();

            ThreadA a = new ThreadA(lock);
            a.start();

            Thread.sleep(5000);

            a.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
/*
>>老机器第一次运行：
begin wait()
出现异常了，因为呈wait状态的线程被interrupt了！
java.lang.InterruptedException
	at java.lang.Object.wait(Native Method)
	at java.lang.Object.wait(Object.java:503)
	at com.gmail.mosoft521.jmtp.ch03.project007waitInterruptException.Service.testMethod(Service.java:9)
	at com.gmail.mosoft521.jmtp.ch03.project007waitInterruptException.ThreadA.run(ThreadA.java:15)
>>第二次运行：
begin wait()
java.lang.InterruptedException
	at java.lang.Object.wait(Native Method)
	at java.lang.Object.wait(Object.java:502)
	at com.gmail.mosoft521.jmtp.ch03.project007waitInterruptException.Service.testMethod(Service.java:9)
	at com.gmail.mosoft521.jmtp.ch03.project007waitInterruptException.ThreadA.run(ThreadA.java:15)
出现异常了，因为呈wait状态的线程被interrupt了！
 */