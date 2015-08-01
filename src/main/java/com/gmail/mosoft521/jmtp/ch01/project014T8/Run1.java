package com.gmail.mosoft521.jmtp.ch01.project014T8;

/**
 * Created by Alvin on 2015/8/1.
 */
public class Run1 {
    public static void main(String[] args) {
        MyThread1 mythread = new MyThread1();
        System.out.println("begin =" + System.currentTimeMillis());
        mythread.run();
        System.out.println("end   =" + System.currentTimeMillis());
    }
}
/*
begin =1438430037083
run threadName=main begin
run threadName=main end
end   =1438430039083
 */