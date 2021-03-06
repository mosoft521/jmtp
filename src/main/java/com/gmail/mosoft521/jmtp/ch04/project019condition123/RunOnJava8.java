package com.gmail.mosoft521.jmtp.ch04.project019condition123;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

public class RunOnJava8 {

    volatile private static int nextPrintWho = 1;
    private static ReentrantLock lock = new ReentrantLock();
    final private static Condition conditionA = lock.newCondition();
    final private static Condition conditionB = lock.newCondition();
    final private static Condition conditionC = lock.newCondition();

    public static void main(String[] args) {

        Runnable threadA = () -> {
            try {
                lock.lock();
                while (nextPrintWho != 1) {
                    conditionA.await();
                }
                for (int i = 0; i < 3; i++) {
                    System.out.println("ThreadA " + (i + 1));
                }
                nextPrintWho = 2;
                conditionB.signalAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        };

        Runnable threadB = () -> {
            try {
                lock.lock();
                while (nextPrintWho != 2) {
                    conditionB.await();
                }
                for (int i = 0; i < 3; i++) {
                    System.out.println("ThreadB " + (i + 1));
                }
                nextPrintWho = 3;
                conditionC.signalAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        };

        Runnable threadC = () -> {
            try {
                lock.lock();
                while (nextPrintWho != 3) {
                    conditionC.await();
                }
                for (int i = 0; i < 3; i++) {
                    System.out.println("ThreadC " + (i + 1));
                }
                nextPrintWho = 1;
                conditionA.signalAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        };

        Thread[] aArray = new Thread[5];
        Thread[] bArray = new Thread[5];
        Thread[] cArray = new Thread[5];

        IntStream.range(0, 5)
                .forEach(i -> {
                    aArray[i] = new Thread(threadA);
                    bArray[i] = new Thread(threadB);
                    cArray[i] = new Thread(threadC);
                    aArray[i].start();
                    bArray[i].start();
                    cArray[i].start();
                });

    }
}
/*
ThreadA 1
ThreadA 2
ThreadA 3
ThreadB 1
ThreadB 2
ThreadB 3
ThreadC 1
ThreadC 2
ThreadC 3
ThreadA 1
ThreadA 2
ThreadA 3
ThreadB 1
ThreadB 2
ThreadB 3
ThreadC 1
ThreadC 2
ThreadC 3
ThreadA 1
ThreadA 2
ThreadA 3
ThreadB 1
ThreadB 2
ThreadB 3
ThreadC 1
ThreadC 2
ThreadC 3
ThreadA 1
ThreadA 2
ThreadA 3
ThreadB 1
ThreadB 2
ThreadB 3
ThreadC 1
ThreadC 2
ThreadC 3
ThreadA 1
ThreadA 2
ThreadA 3
ThreadB 1
ThreadB 2
ThreadB 3
ThreadC 1
ThreadC 2
ThreadC 3
 */