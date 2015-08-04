package com.gmail.mosoft521.jmtp.ch03.project036InheritableThreadLocal2;

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
       在Main线程中取值=1438697920430
       在Main线程中取值=1438697920430
       在Main线程中取值=1438697920430
       在Main线程中取值=1438697920430
       在Main线程中取值=1438697920430
       在Main线程中取值=1438697920430
       在Main线程中取值=1438697920430
       在Main线程中取值=1438697920430
       在Main线程中取值=1438697920430
       在Main线程中取值=1438697920430
在ThreadA线程中取值=1438697920430 我在子线程加的~!
在ThreadA线程中取值=1438697920430 我在子线程加的~!
在ThreadA线程中取值=1438697920430 我在子线程加的~!
在ThreadA线程中取值=1438697920430 我在子线程加的~!
在ThreadA线程中取值=1438697920430 我在子线程加的~!
在ThreadA线程中取值=1438697920430 我在子线程加的~!
在ThreadA线程中取值=1438697920430 我在子线程加的~!
在ThreadA线程中取值=1438697920430 我在子线程加的~!
在ThreadA线程中取值=1438697920430 我在子线程加的~!
在ThreadA线程中取值=1438697920430 我在子线程加的~!
 */