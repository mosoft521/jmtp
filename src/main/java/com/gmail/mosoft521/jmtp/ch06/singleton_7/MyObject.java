package com.gmail.mosoft521.jmtp.ch06.singleton_7;

public class MyObject {

    private MyObject() {
    }

    public static MyObject getInstance() {
        return MyObjectHandler.myObject;
    }

    // 内部类方式
    private static class MyObjectHandler {
        private static MyObject myObject = new MyObject();
    }
}