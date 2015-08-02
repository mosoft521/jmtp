package com.gmail.mosoft521.jmtp.ch02.project018synBlockString2;

public class Run {

    public static void main(String[] args) {
        Service service = new Service();

        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();

        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
    }
}
/*
a begin
b begin
b   end
a   end
 */