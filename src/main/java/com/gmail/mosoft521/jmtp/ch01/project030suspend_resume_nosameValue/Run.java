package com.gmail.mosoft521.jmtp.ch01.project030suspend_resume_nosameValue;

/**
 * Created by Alvin on 2015/8/1.
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {

        final MyObject myobject = new MyObject();

        Thread thread1 = new Thread() {
            public void run() {
                myobject.setValue("a", "aa");
            }
        };
        thread1.setName("a");
        thread1.start();

        Thread.sleep(500);

        Thread thread2 = new Thread() {
            public void run() {
                myobject.printUsernamePassword();
            }
        };
        thread2.start();
    }
}
/*
暂停a线程！
a 11
暂停状态
 */