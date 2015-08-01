package com.gmail.mosoft521.jmtp.ch01.project024RunMethodUseStopMethod;

/**
 * Created by Alvin on 2015/8/1.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            this.stop();
        } catch (ThreadDeath e) {
            System.out.println("进入了catch()方法！");
            e.printStackTrace();
        }
    }
}
