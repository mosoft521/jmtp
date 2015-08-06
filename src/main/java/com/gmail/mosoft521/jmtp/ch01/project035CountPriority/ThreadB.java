package com.gmail.mosoft521.jmtp.ch01.project035CountPriority;

public class ThreadB extends Thread {

    private int count = 0;

    public int getCount() {
        return count;
    }

    @Override
    public void run() {
        while (true) {
            count++;
        }
    }
}