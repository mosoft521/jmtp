package com.gmail.mosoft521.jmtp.ch04.project003UseConditionWaitNotifyError;

public class Run {

    public static void main(String[] args) {

        MyService service = new MyService();

        ThreadA a = new ThreadA(service);
        a.start();
    }
}
/*
Exception in thread "Thread-0" java.lang.IllegalMonitorStateException
	at java.util.concurrent.locks.ReentrantLock$Sync.tryRelease(ReentrantLock.java:151)
	at java.util.concurrent.locks.AbstractQueuedSynchronizer.release(AbstractQueuedSynchronizer.java:1261)
	at java.util.concurrent.locks.AbstractQueuedSynchronizer.fullyRelease(AbstractQueuedSynchronizer.java:1723)
	at java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(AbstractQueuedSynchronizer.java:2036)
	at com.gmail.mosoft521.jmtp.ch04.project003UseConditionWaitNotifyError.MyService.await(MyService.java:14)
	at com.gmail.mosoft521.jmtp.ch04.project003UseConditionWaitNotifyError.ThreadA.run(ThreadA.java:14)
 */