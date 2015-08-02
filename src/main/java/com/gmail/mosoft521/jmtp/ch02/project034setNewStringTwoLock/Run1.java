package com.gmail.mosoft521.jmtp.ch02.project034setNewStringTwoLock;

public class Run1 {

    public static void main(String[] args) throws InterruptedException {

        MyService service = new MyService();

        ThreadA a = new ThreadA(service);
        a.setName("A");

        ThreadB b = new ThreadB(service);
        b.setName("B");

        a.start();
        Thread.sleep(50);// 存在50毫秒
        b.start();
    }
}
/*
A begin 1438491593105
B begin 1438491593154
A   end 1438491595105
B   end 1438491595154
 */