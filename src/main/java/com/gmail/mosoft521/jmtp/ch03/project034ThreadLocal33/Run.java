package com.gmail.mosoft521.jmtp.ch03.project034ThreadLocal33;

public class Run {

    public static void main(String[] args) {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("       在Main线程中取值=" + Tools.tl.get());
                Thread.sleep(100);
            }
            Thread.sleep(5000);
            ThreadA a = new ThreadA();
            a.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
/*
       在Main线程中取值=1438697571872
       在Main线程中取值=1438697571872
       在Main线程中取值=1438697571872
       在Main线程中取值=1438697571872
       在Main线程中取值=1438697571872
       在Main线程中取值=1438697571872
       在Main线程中取值=1438697571872
       在Main线程中取值=1438697571872
       在Main线程中取值=1438697571872
       在Main线程中取值=1438697571872
在ThreadA线程中取值=1438697577877
在ThreadA线程中取值=1438697577877
在ThreadA线程中取值=1438697577877
在ThreadA线程中取值=1438697577877
在ThreadA线程中取值=1438697577877
在ThreadA线程中取值=1438697577877
在ThreadA线程中取值=1438697577877
在ThreadA线程中取值=1438697577877
在ThreadA线程中取值=1438697577877
在ThreadA线程中取值=1438697577877
 */