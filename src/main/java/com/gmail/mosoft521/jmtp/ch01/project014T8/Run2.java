package com.gmail.mosoft521.jmtp.ch01.project014T8;

public class Run2 {
    public static void main(String[] args) {
        MyThread2 mythread = new MyThread2();
        System.out.println("begin =" + System.currentTimeMillis());
        mythread.start();
        System.out.println("end   =" + System.currentTimeMillis());
    }
}
/*
begin =1438430054473
end   =1438430054473
run threadName=Thread-0 begin =1438430054474
run threadName=Thread-0 end   =1438430056474
 */