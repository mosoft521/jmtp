package com.gmail.mosoft521.jmtp.ch03.project033ThreadLocal22;

public class ThreadLocalExt extends ThreadLocal {
    @Override
    protected Object initialValue() {
        return "我是默认值 第一次get不再为null";
    }
}