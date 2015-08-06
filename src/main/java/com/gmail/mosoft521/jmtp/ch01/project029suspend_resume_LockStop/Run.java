package com.gmail.mosoft521.jmtp.ch01.project029suspend_resume_LockStop;

public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.suspend();
            System.out.println("main end!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
/*
 版本1:
 main end!
 暂停状态
版本2:
1
2
...
142819
142820
暂停状态
 */