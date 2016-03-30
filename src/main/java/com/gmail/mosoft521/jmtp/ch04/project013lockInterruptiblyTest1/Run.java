package com.gmail.mosoft521.jmtp.ch04.project013lockInterruptiblyTest1;

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

        threadB.interrupt();// 打标记
        System.out.println("main end!");
    }
}
/*
//(一)lock.lock();
lock begin A
main end!
lock   end A
lock begin B
lock   end B

//（二）lock.lockInterruptibly();
lock begin A
main end!
java.lang.InterruptedException
	at java.util.concurrent.locks.AbstractQueuedSynchronizer.acquireInterruptibly(AbstractQueuedSynchronizer.java:1220)
	at java.util.concurrent.locks.ReentrantLock.lockInterruptibly(ReentrantLock.java:335)
	at com.gmail.mosoft521.jmtp.ch04.project013lockInterruptiblyTest1.MyService.waitMethod(MyService.java:14)
	at com.gmail.mosoft521.jmtp.ch04.project013lockInterruptiblyTest1.Run$1.run(Run.java:9)
	at java.lang.Thread.run(Thread.java:745)
lock   end A
 */