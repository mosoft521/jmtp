package com.gmail.mosoft521.jmtp.ch06.singleton_5;

public class MyObject {

    private volatile static MyObject myObject;

    private MyObject() {
    }

    // 使用DCL双检测机制来解决问题
    // 即保证了不需要同步代码的异步
    // 又保证了单例的效果
    public static MyObject getInstance() {
        try {
            if (null == myObject) {
                // 模拟在创建对象之前做一些准备性的工作
                Thread.sleep(3000);
                synchronized (MyObject.class) {
                    if (null == myObject) {
                        myObject = new MyObject();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myObject;
    }
    // 此版本的代码称为：
    // 双重检查Double-Check Locking
}