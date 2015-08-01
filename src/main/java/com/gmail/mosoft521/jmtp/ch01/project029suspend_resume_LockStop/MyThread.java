package com.gmail.mosoft521.jmtp.ch01.project029suspend_resume_LockStop;

/**
 * Created by Alvin on 2015/8/1.
 */
public class MyThread extends Thread {
    private long i = 0;

    @Override
    public void run() {
        while (true) {
            i++;
//            System.out.println(i);
        }
    }
}
