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
lock begin A
main end!
lock   end A
lock begin B
lock   end B
 */