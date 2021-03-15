package com.gmail.mosoft521.jmtp.ch03.project013p_r_allWait;

public class Run {

    public static void main(String[] args) throws InterruptedException {

        String lock = new String("");
        P p = new P(lock);
        C c = new C(lock);

        ThreadP[] pThread = new ThreadP[2];
        ThreadC[] cThread = new ThreadC[2];

        for (int i = 0; i < 2; i++) {
            pThread[i] = new ThreadP(p);
            pThread[i].setName("生产者" + (i + 1));

            cThread[i] = new ThreadC(c);
            cThread[i].setName("消费者" + (i + 1));

            pThread[i].start();
            cThread[i].start();
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
>>第一次运行：
生产者 生产者1 RUNNABLE了
生产者 生产者1 WAITING了★
消费者 消费者1 RUNNABLE了
消费者 消费者1 WAITING了☆
生产者 生产者1 RUNNABLE了
生产者 生产者1 WAITING了★
消费者 消费者1 RUNNABLE了
消费者 消费者1 WAITING了☆
生产者 生产者2 RUNNABLE了
生产者 生产者2 WAITING了★
生产者 生产者1 WAITING了★
消费者 消费者1 RUNNABLE了
消费者 消费者1 WAITING了☆
生产者 生产者2 RUNNABLE了
生产者 生产者2 WAITING了★
消费者 消费者2 RUNNABLE了
消费者 消费者2 WAITING了☆
生产者 生产者1 RUNNABLE了
生产者 生产者1 WAITING了★
生产者 生产者2 WAITING了★
消费者 消费者1 RUNNABLE了
消费者 消费者1 WAITING了☆
消费者 消费者2 WAITING了☆
main RUNNABLE
Monitor Ctrl-Break RUNNABLE
生产者1 WAITING
消费者1 WAITING
生产者2 WAITING
消费者2 WAITING
...阻塞了...
>>第二次运行：
生产者 生产者1 RUNNABLE了
消费者 消费者1 RUNNABLE了
消费者 消费者1 WAITING了☆
生产者 生产者1 RUNNABLE了
生产者 生产者1 WAITING了★
消费者 消费者1 RUNNABLE了
消费者 消费者1 WAITING了☆
生产者 生产者1 RUNNABLE了
生产者 生产者1 WAITING了★
消费者 消费者1 RUNNABLE了
消费者 消费者1 WAITING了☆
生产者 生产者1 RUNNABLE了
生产者 生产者1 WAITING了★
消费者 消费者1 RUNNABLE了
消费者 消费者1 WAITING了☆
生产者 生产者1 RUNNABLE了
生产者 生产者1 WAITING了★
消费者 消费者1 RUNNABLE了
消费者 消费者1 WAITING了☆
生产者 生产者1 RUNNABLE了
生产者 生产者1 WAITING了★
消费者 消费者1 RUNNABLE了
消费者 消费者1 WAITING了☆
生产者 生产者1 RUNNABLE了
生产者 生产者1 WAITING了★
消费者 消费者1 RUNNABLE了
消费者 消费者1 WAITING了☆
生产者 生产者1 RUNNABLE了
生产者 生产者1 WAITING了★
消费者 消费者1 RUNNABLE了
消费者 消费者1 WAITING了☆
生产者 生产者1 RUNNABLE了
生产者 生产者1 WAITING了★
消费者 消费者1 RUNNABLE了
消费者 消费者1 WAITING了☆
生产者 生产者2 RUNNABLE了
生产者 生产者2 WAITING了★
生产者 生产者1 WAITING了★
消费者 消费者1 RUNNABLE了
消费者 消费者1 WAITING了☆
消费者 消费者2 WAITING了☆
生产者 生产者2 RUNNABLE了
生产者 生产者2 WAITING了★
生产者 生产者1 WAITING了★
main RUNNABLE
Monitor Ctrl-Break RUNNABLE
生产者1 WAITING
消费者1 WAITING
生产者2 WAITING
消费者2 WAITING
...阻塞了...
 */