package com.gmail.mosoft521.jmtp.ch03.project012p_r_test;

public class ThreadC extends Thread {

    private C r;

    public ThreadC(C r) {
        super();
        this.r = r;
    }

    @Override
    public void run() {
        while (true) {
            r.getValue();
        }
    }
}