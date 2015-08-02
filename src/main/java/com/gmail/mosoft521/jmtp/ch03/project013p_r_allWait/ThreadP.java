package com.gmail.mosoft521.jmtp.ch03.project013p_r_allWait;

public class ThreadP extends Thread {

    private P p;

    public ThreadP(P p) {
        super();
        this.p = p;
    }

    @Override
    public void run() {
        while (true) {
            p.setValue();
        }
    }
}