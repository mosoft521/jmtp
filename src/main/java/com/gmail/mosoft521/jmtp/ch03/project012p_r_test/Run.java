package com.gmail.mosoft521.jmtp.ch03.project012p_r_test;

public class Run {

    public static void main(String[] args) {

        String lock = new String("");
        P p = new P(lock);
        C r = new C(lock);

        ThreadP pThread = new ThreadP(p);
        ThreadC rThread = new ThreadC(r);

        pThread.start();
        rThread.start();
    }
}
/*
...
set的值是1438505814708_5248522567334
get的值是1438505814708_5248522567334
set的值是1438505814708_5248522749798
get的值是1438505814708_5248522749798
set的值是1438505814708_5248522822512
get的值是1438505814708_5248522822512
...
 */