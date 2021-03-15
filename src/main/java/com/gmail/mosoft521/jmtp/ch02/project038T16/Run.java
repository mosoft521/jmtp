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
>>版本一：无volatile 和书上不一致：JVM8 64bit 只有-server模式
进入run了
已经赋值为false
>>线程没停掉... 死循环了

>>版本二：有volatile
进入run了
已经赋值为false
线程被停止了！
 */