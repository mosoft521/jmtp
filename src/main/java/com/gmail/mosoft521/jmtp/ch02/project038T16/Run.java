package com.gmail.mosoft521.jmtp.ch02.project038T16;

public class Run {
    public static void main(String[] args) {
        try {
            RunThread thread = new RunThread();
            thread.start();
            Thread.sleep(100);
            thread.setRunning(false);
            System.out.println("已经赋值为false");
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
/*
>>无volatile
进入run了
已经赋值为false

>>有volatile
进入run了
已经赋值为false
线程被停止了！
 */