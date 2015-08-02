package com.gmail.mosoft521.jmtp.ch03.project017stack_2_new_final;

public class C_Thread extends Thread {

    private C r;

    public C_Thread(C r) {
        super();
        this.r = r;
    }

    @Override
    public void run() {
        while (true) {
            r.popService();
        }
    }
}