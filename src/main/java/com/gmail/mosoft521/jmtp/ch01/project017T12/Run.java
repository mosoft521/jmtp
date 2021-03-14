package com.gmail.mosoft521.jmtp.ch01.project017T12;

public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(10000);
//            thread.interrupt();
            Thread.currentThread().interrupt();
            System.out.println("是否停止1？=" + thread.interrupted());
            System.out.println("是否停止2？=" + thread.interrupted());
            System.out.println();
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
i=1781237
是否停止1？=false
i=1781238
i=1781239
是否停止2？=false
...
停止不了
当前线程是main，从未中断过，所以2个false

//ver2:
i=1
i=2
...
i=1745300
i=1745301
是否停止1？=true
i=1745302
是否停止2？=false
i=1745303

 */