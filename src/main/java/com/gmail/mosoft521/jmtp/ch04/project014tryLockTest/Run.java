package com.gmail.mosoft521.jmtp.ch04.project014tryLockTest;

public class Run {

    public static void main(String[] args) throws InterruptedException {
        final MyService service = new MyService();

        Runnable runnableRef = new Runnable() {
            public void run() {
                service.waitMethod();
            }
        };

        Thread threadA = new Thread(runnableRef);
        threadA.setName("A");
        threadA.start();

        Thread threadB = new Thread(runnableRef);
        threadB.setName("B");
        threadB.start();
    }
}
/*
A获得锁
B没有获得锁
 */