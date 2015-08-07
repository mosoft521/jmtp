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
Exception in thread "main" java.lang.NullPointerException
	at com.gmail.mosoft521.jmtp.ch07.project008getGroupParent.Run.main(Run.java:15)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:497)
	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:140)
线程：main 所在的线程组名为：main
main线程所在的线程组的父线程组的名称是：system
 */