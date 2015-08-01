package com.gmail.mosoft521.jmtp.ch01.project036DaemonThread;

public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.setDaemon(true);
            thread.start();
            Thread.sleep(5000);
            System.out.println("我离开thread对象也不再打印了，也就是停止了！");
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
/*
i=1
i=2
i=3
i=4
i=5
我离开thread对象也不再打印了，也就是停止了！
 */