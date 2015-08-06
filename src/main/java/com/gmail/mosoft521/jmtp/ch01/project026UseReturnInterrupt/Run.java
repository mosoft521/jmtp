package com.gmail.mosoft521.jmtp.ch01.project026UseReturnInterrupt;

public class Run {

    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        t.start();
        Thread.sleep(1000);
        t.interrupt();
    }
}
/*
timer=1438436994714
timer=1438436994714
...
timer=1438436995029
timer=1438436995029
停止了!
 */