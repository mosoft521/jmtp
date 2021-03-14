package com.gmail.mosoft521.jmtp.ch01.project017T12;

public class Run3 {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(1000);
            System.out.println("是否停止0？=" + thread.isInterrupted());
            thread.interrupt();
            System.out.println("是否停止1？=" + thread.isInterrupted());
            System.out.println("是否停止2？=" + thread.isInterrupted());
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
/*
i=1
i=2
...
i=106492
是否停止0？=false
i=106493
...
i=106513
是否停止1？=true
i=106514
...
i=106548
是否停止2？=true
i=106549
...
 */