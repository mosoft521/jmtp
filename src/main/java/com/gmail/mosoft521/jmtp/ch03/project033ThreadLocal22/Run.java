package com.gmail.mosoft521.jmtp.ch03.project033ThreadLocal22;

public class Run {
    public static ThreadLocalExt tl = new ThreadLocalExt();

    public static void main(String[] args) {
        if (tl.get() == null) {
            System.out.println("从未放过值");
            tl.set("我的值");
        }
        System.out.println(tl.get());
        System.out.println(tl.get());
    }
}
/*
我是默认值 第一次get不再为null
我是默认值 第一次get不再为null
 */