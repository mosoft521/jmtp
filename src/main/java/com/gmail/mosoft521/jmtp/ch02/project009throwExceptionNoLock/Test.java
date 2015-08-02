package com.gmail.mosoft521.jmtp.ch02.project009throwExceptionNoLock;

public class Test {

    public static void main(String[] args) {
        try {
            Service service = new Service();

            ThreadA a = new ThreadA(service);
            a.setName("a");
            a.start();

            Thread.sleep(500);

            ThreadB b = new ThreadB(service);
            b.setName("b");
            b.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
/*
第一次:
ThreadName=a run beginTime=1438474554593
ThreadName=a run   exceptionTime=1438474558085
Exception in thread "a" Thread B run Time=1438474558086
java.lang.NumberFormatException: For input string: "a"
	at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
	at java.lang.Integer.parseInt(Integer.java:492)
	at java.lang.Integer.parseInt(Integer.java:527)
	at com.gmail.mosoft521.jmtp.ch02.project009throwExceptionNoLock.Service.testMethod(Service.java:11)
	at com.gmail.mosoft521.jmtp.ch02.project009throwExceptionNoLock.ThreadA.run(ThreadA.java:14)
第二次:
ThreadName=a run beginTime=1438474745380
Exception in thread "a" java.lang.NumberFormatException: For input string: "a"
ThreadName=a run exceptionTime=1438474745841
	at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
	at java.lang.Integer.parseInt(Integer.java:492)
	at java.lang.Integer.parseInt(Integer.java:527)
	at com.gmail.mosoft521.jmtp.ch02.project009throwExceptionNoLock.Service.testMethod(Service.java:11)
	at com.gmail.mosoft521.jmtp.ch02.project009throwExceptionNoLock.ThreadA.run(ThreadA.java:14)
Thread B run Time=1438474745876
 */