package com.gmail.mosoft521.jmtp.ch01.project025StopThrowLock;

/**
 * Created by Alvin on 2015/8/1.
 */
public class Run {
    public static void main(String[] args) {
        try {
            SynchronizedObject object = new SynchronizedObject();
            MyThread thread = new MyThread(object);
            thread.start();
            Thread.sleep(500);
            thread.stop();
            System.out.println(object.getUsername() + " " + object.getPassword());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
//b aa