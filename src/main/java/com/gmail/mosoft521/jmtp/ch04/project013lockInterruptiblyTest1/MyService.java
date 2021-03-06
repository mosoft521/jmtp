package com.gmail.mosoft521.jmtp.ch04.project013lockInterruptiblyTest1;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

    public ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void waitMethod() {
        //lock.lock()版本：
//        try {
//            lock.lock();
//            System.out.println("lock begin " + Thread.currentThread().getName());
//            for (int i = 0; i < Integer.MAX_VALUE / 10; i++) {
//                String newString = new String();
//                Math.random();
//            }
//            System.out.println("lock   end " + Thread.currentThread().getName());
//        } finally {
//            if (lock.isHeldByCurrentThread()) {
//                lock.unlock();
//            }
//        }

        //lock.lockInterruptibly()版本：
        try {
            lock.lockInterruptibly();
            System.out.println("lock begin " + Thread.currentThread().getName());
            for (int i = 0; i < Integer.MAX_VALUE / 10; i++) {
                String newString = new String();
                Math.random();
            }
            System.out.println("lock   end " + Thread.currentThread().getName());
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        } finally {
            if (lock.isHeldByCurrentThread()) {
                lock.unlock();
            }
        }
    }
}