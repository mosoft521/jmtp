package com.gmail.mosoft521.jmtp.ch02.project028TwoStop;

public class Run {

    public static void main(String[] args) {
        Service service = new Service();

        ThreadA athread = new ThreadA(service);
        athread.start();

        ThreadB bthread = new ThreadB(service);
        bthread.start();
    }
}
/*
>>同步方法:
methodA begin
>>同步块:
methodA begin
methodB begin
methodB end
 */