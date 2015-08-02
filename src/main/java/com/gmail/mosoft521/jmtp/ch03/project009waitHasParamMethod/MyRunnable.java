package com.gmail.mosoft521.jmtp.ch03.project009waitHasParamMethod;

public class MyRunnable {
    static private Object lock = new Object();
    static private Runnable runnable1 = new Runnable() {
        public void run() {
            try {
                synchronized (lock) {
                    System.out.println("wait begin timer=" + System.currentTimeMillis());
                    lock.wait(5000);
                    System.out.println("wait   end timer=" + System.currentTimeMillis());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };

    static private Runnable runnable2 = new Runnable() {
        public void run() {
            synchronized (lock) {
                System.out.println("notify begin timer=" + System.currentTimeMillis());
                lock.notify();
                System.out.println("notify   end timer=" + System.currentTimeMillis());
            }
        }
    };

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(runnable1);
        t1.start();
        Thread.sleep(3000);
        Thread t2 = new Thread(runnable2);
        t2.start();
    }
}
/*
>>版本一:只跑t1
wait begin timer=1438521905921
wait   end timer=1438521910942
5021
>>版本二:混跑t1&t2
wait begin timer=1438521983337
notify begin timer=1438521986338
notify   end timer=1438521986338
wait   end timer=1438521986338
3001
 */