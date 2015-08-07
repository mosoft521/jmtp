package com.gmail.mosoft521.jmtp.ch06.singleton_2;

public class MyObject {

    private static MyObject myObject;

    private MyObject() {
    }

    public static MyObject getInstance() {
        try {
            if (myObject != null) {
            } else {
                // ģ���ڴ�������֮ǰ��һЩ׼���ԵĹ���
                Thread.sleep(3000);
                myObject = new MyObject();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myObject;
    }
}