package com.gmail.mosoft521.jmtp.ch01.project035CountPriority;

public class Run {

    public static void main(String[] args) {

        try {
            ThreadA a = new ThreadA();
            a.setPriority(Thread.NORM_PRIORITY - 3);
            a.start();
            ThreadB b = new ThreadB();
            b.setPriority(Thread.NORM_PRIORITY + 3);
            b.start();

//            Thread.sleep(20000);
            Thread.sleep(2000);
            a.stop();
            b.stop();

            System.out.println("a=" + a.getCount());
            System.out.println("b=" + b.getCount());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
/*
版本1:20s
a=1017108092
b=-501407768
呵呵，b都溢出了

版本2:2s
a=804243595
b=861557967
 */