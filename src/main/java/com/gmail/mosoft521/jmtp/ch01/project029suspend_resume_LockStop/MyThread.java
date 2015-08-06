package com.gmail.mosoft521.jmtp.ch01.project029suspend_resume_LockStop;

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