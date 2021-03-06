package com.gmail.mosoft521.jmtp.ch03.project013p_r_allWait_fix;

public class Run {

    public static void main(String[] args) throws InterruptedException {

        String lock = new String("");
        P p = new P(lock);
        C r = new C(lock);

        ThreadP[] pThread = new ThreadP[2];
        ThreadR[] rThread = new ThreadR[2];

        for (int i = 0; i < 2; i++) {
            pThread[i] = new ThreadP(p);
            pThread[i].setName("生产者" + (i + 1));

            rThread[i] = new ThreadR(r);
            rThread[i].setName("消费者" + (i + 1));

            pThread[i].start();
            rThread[i].start();
        }

        Thread.sleep(5000);
        Thread[] threadArray = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
        Thread.currentThread().getThreadGroup().enumerate(threadArray);

        for (int i = 0; i < threadArray.length; i++) {
            System.out.println(threadArray[i].getName() + " " + threadArray[i].getState());
        }
    }
}
/*
生产者 生产者1 RUNNABLE了
生产者 生产者1 WAITING了★
消费者 消费者2 RUNNABLE了
消费者 消费者2 WAITING了☆
消费者 消费者1 WAITING了☆
生产者 生产者2 RUNNABLE了
生产者 生产者2 WAITING了★
消费者 消费者1 RUNNABLE了
消费者 消费者1 WAITING了☆
消费者 消费者2 WAITING了☆
生产者 生产者1 RUNNABLE了
生产者 生产者1 WAITING了★
消费者 消费者2 RUNNABLE了
消费者 消费者2 WAITING了☆
消费者 消费者1 WAITING了☆
生产者 生产者2 RUNNABLE了
生产者 生产者2 WAITING了★
...
 */