package com.gmail.mosoft521.jmtp.ch03.project030ThreadLocal11;

public class Run {
    public static ThreadLocal tl = new ThreadLocal();

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
从未放过值
我的值
我的值
 */