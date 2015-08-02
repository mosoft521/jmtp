package com.gmail.mosoft521.jmtp.ch02.project037T10;

public class Run {

    public static void main(String[] args) {
        PrintString printStringService = new PrintString();
        new Thread(printStringService).start();

        System.out.println("我要停止它！stopThread=" + Thread.currentThread().getName());
        printStringService.setContinuePrint(false);
    }
}
/*
我要停止它！stopThread=main
run printStringMethod threadName=Thread-0
第二次:
我要停止它！stopThread=main
 */