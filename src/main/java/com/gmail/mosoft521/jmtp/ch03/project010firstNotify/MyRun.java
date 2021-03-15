package com.gmail.mosoft521.jmtp.ch03.project010firstNotify;

public class MyRun {

    private String lock = new String("");
    private boolean isFirstRunB = false;

    private Runnable runnableA = new Runnable() {
        public void run() {
            try {
                synchronized (lock) {
                    while (!isFirstRunB) {
                        System.out.println("begin wait");
                        lock.wait();
                        System.out.println("end wait");
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };

    private Runnable runnableB = new Runnable() {
        public void run() {
            synchronized (lock) {
                System.out.println("begin notify");
                lock.notify();
                System.out.println("end notify");
                isFirstRunB = true;
            }
        }
    };

    public static void main(String[] args) throws InterruptedException {
        //版本一
        MyRun run = new MyRun();
        Thread a = new Thread(run.runnableA);
        a.start();
        Thread.sleep(100);
        Thread b = new Thread(run.runnableB);
        b.start();
        //版本二:
//        MyRun run = new MyRun();
//        Thread b = new Thread(run.runnableB);
//        b.start();
//        Thread.sleep(3000);
//        Thread a = new Thread(run.runnableA);
//        a.start();
    }
}
/*
>>版本一:无开关顺序版
begin wait
begin notify
end notify
end wait
>>版本二:无开关逆序版
begin notify
end notify
begin wait
hold住了?
>>版本三:有开关顺序版
begin wait
begin notify
end notify
end wait
>>版本四:有开关逆序版(对比版本二,没hold住:)
begin notify
end notify
 */