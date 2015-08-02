package com.gmail.mosoft521.jmtp.ch02.project034setNewStringTwoLock;

public class Run2 {

    public static void main(String[] args) throws InterruptedException {

        MyService service = new MyService();

        ThreadA a = new ThreadA(service);
        a.setName("A");

        ThreadB b = new ThreadB(service);
        b.setName("B");

        a.start();
        b.start();
    }
}
/*
A begin 1438491619282
B begin 1438491619282
B   end 1438491621282
A   end 1438491621282
 */