package com.gmail.mosoft521.jmtp.ch07.project008getGroupParent;

public class Run {

    public static void main(String[] args) {
        System.out.println("线程：" + Thread.currentThread().getName()
                + " 所在的线程组名为："
                + Thread.currentThread().getThreadGroup().getName());
        System.out
                .println("main线程所在的线程组的父线程组的名称是："
                        + Thread.currentThread().getThreadGroup().getParent()
                        .getName());
        System.out.println("main线程所在的线程组的父线程组的父线程组的名称是："
                + Thread.currentThread().getThreadGroup().getParent()
                .getParent().getName());
    }

}
/*
>>第一次运行：
线程：main 所在的线程组名为：main
main线程所在的线程组的父线程组的名称是：system
Exception in thread "main" java.lang.NullPointerException
	at com.gmail.mosoft521.jmtp.ch07.project008getGroupParent.Run.main(Run.java:15)
 */