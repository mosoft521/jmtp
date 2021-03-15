package com.gmail.mosoft521.jmtp.ch02.project036T99;

public class Run {

    public static void main(String[] args) {
        PrintString printStringService = new PrintString();
        printStringService.printStringMethod();
        System.out.println("我要停止它！stopThread=" + Thread.currentThread().getName());
        printStringService.setContinuePrint(false);
    }
}
/*
run printStringMethod threadName=main
run printStringMethod threadName=main
run printStringMethod threadName=main
run printStringMethod threadName=main
run printStringMethod threadName=main
run printStringMethod threadName=main
run printStringMethod threadName=main
>>停不下来的原因：main线程一直在处理while()循环
 */