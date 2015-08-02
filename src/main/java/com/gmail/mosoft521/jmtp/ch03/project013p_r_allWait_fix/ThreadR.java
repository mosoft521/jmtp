package com.gmail.mosoft521.jmtp.ch03.project013p_r_allWait_fix;

public class ThreadR extends Thread {

    private C r;

    public ThreadR(C r) {
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