package com.gmail.mosoft521.jmtp.ch01.project025StopThrowLock;

/**
 * Created by Alvin on 2015/8/1.
 */
public class MyThread extends Thread {

    private SynchronizedObject object;

    public MyThread(SynchronizedObject object) {
        super();
        this.object = object;
    }

    @Override
    public void run() {
        object.printString("b", "bb");
    }
}
