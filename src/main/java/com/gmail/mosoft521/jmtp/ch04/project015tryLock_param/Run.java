package com.gmail.mosoft521.jmtp.ch04.project015tryLock_param;

public class Run {

    public static void main(String[] args) throws InterruptedException {
        final MyService service = new MyService();

        Runnable runnableRef = new Runnable() {
            public void run() {
                System.out.println(Thread.currentThread().getName() + "调用waitMethod时间：" + System.currentTimeMillis());
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
>>第一次运行：
B调用waitMethod时间：1438869971428
A调用waitMethod时间：1438869971428
      A获得锁的时间：1438869971429
      B没有获得锁
>>第二次运行：
A调用waitMethod时间：1615862794487
B调用waitMethod时间：1615862794487
      B获得锁的时间：1615862794488
      A没有获得锁
 */