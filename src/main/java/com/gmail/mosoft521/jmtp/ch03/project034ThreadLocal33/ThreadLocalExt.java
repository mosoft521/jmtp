package com.gmail.mosoft521.jmtp.ch03.project034ThreadLocal33;

import java.util.Date;

public class ThreadLocalExt extends ThreadLocal {
    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }
}