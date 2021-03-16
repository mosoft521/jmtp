package com.gmail.mosoft521.jmtp.ch04.project011lockMethodTest2.test2;

public class Run {

    public static void main(String[] args) throws InterruptedException {
        final Service service = new Service();

        Runnable runnable = new Runnable() {
            public void run() {
                service.waitMethod();
            }
        };

        Thread[] threadArray = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threadArray[i] = new Thread(runnable);
        }
        for (int i = 0; i < 10; i++) {
            threadArray[i].start();
        }
        Thread.sleep(2000);
        service.notityMethod();
        Thread.sleep(2000);
        service.notityMethod();
    }
}
/*
有没有线程正在等待newCondition？true 线程数是多少？10
有没有线程正在等待newCondition？true 线程数是多少？9
Hold住
 */