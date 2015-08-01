package com.gmail.mosoft521.jmtp.ch01.project021T14;

/**
 * Created by Alvin on 2015/8/1.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            System.out.println("run begin");
            Thread.sleep(200000);
            System.out.println("run end");
        } catch (InterruptedException e) {
            System.out.println("在沉睡中被停止!进入catch! " + this.isInterrupted());
            e.printStackTrace();
        }
    }
}
