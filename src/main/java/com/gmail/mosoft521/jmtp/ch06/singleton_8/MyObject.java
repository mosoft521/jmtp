package com.gmail.mosoft521.jmtp.ch06.singleton_8;

public class MyObject {

    private static MyObject instance = null;

    static {
        instance = new MyObject();
    }

    private MyObject() {
    }

    public static MyObject getInstance() {
        return instance;
    }
}