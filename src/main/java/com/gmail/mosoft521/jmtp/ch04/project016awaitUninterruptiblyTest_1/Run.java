package com.gmail.mosoft521.jmtp.ch04.project016awaitUninterruptiblyTest_1;

public class Run {

    public static void main(String[] args) {
        try {
            Service service = new Service();
            MyThread myThread = new MyThread(service);
            myThread.start();
            Thread.sleep(3000);
            myThread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
/*
wait begin
java.lang.InterruptedException
	at java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.reportInterruptAfterWait(AbstractQueuedSynchronizer.java:2014)
	at java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(AbstractQueuedSynchronizer.java:2048)
	at com.gmail.mosoft521.jmtp.ch04.project016awaitUninterruptiblyTest_1.Service.testMethod(Service.java:15)
	at com.gmail.mosoft521.jmtp.ch04.project016awaitUninterruptiblyTest_1.MyThread.run(MyThread.java:14)
catch
 */