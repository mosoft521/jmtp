package com.gmail.mosoft521.jmtp.ch01.project018T13;

/**
 * Created by Alvin on 2015/8/1.
 */
public class Run {

    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(2000);
            thread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
/*
i=1
i=2
...
i=257204
end!
已经是停止状态了!我要退出了!
 */