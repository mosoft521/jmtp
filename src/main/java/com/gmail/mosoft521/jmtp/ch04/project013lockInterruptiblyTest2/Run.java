package com.gmail.mosoft521.jmtp.ch04.project013lockInterruptiblyTest2;

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
        Thread.sleep(500);

        Thread threadB = new Thread(runnableRef);
        threadB.setName("B");
        threadB.start();
        threadB.interrupt();
    }
}
/*
lock A
线程B进入catch~!
java.lang.InterruptedException
	at java.util.concurrent.locks.AbstractQueuedSynchronizer.acquireInterruptibly(AbstractQueuedSynchronizer.java:1220)
	at java.util.concurrent.locks.ReentrantLock.lockInterruptibly(ReentrantLock.java:335)
	at com.gmail.mosoft521.jmtp.ch04.project014lockInterruptiblyTest2.MyService.waitMethod(MyService.java:13)
	at com.gmail.mosoft521.jmtp.ch04.project014lockInterruptiblyTest2.Run$1.run(Run.java:9)
	at java.lang.Thread.run(Thread.java:745)
 */