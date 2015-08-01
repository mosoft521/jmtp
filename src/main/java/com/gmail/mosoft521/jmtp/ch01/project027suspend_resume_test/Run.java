package com.gmail.mosoft521.jmtp.ch01.project027suspend_resume_test;

/**
 * Created by Alvin on 2015/8/1.
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(5000);
            // A
            thread.suspend();
            System.out.println("A= " + System.currentTimeMillis() + " i=" + thread.getI());
            Thread.sleep(5000);
            System.out.println("A= " + System.currentTimeMillis() + " i=" + thread.getI());
            // B
            thread.resume();
            Thread.sleep(5000);

            // C
            thread.suspend();
            System.out.println("B= " + System.currentTimeMillis() + " i=" + thread.getI());
            Thread.sleep(5000);
            System.out.println("B= " + System.currentTimeMillis() + " i=" + thread.getI());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
/*
A= 1438437635344 i=2188138219
A= 1438437640344 i=2188138219
B= 1438437645344 i=4451498607
B= 1438437650344 i=4451498607
...
 */