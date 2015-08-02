package com.gmail.mosoft521.jmtp.ch03.project004wait_notify_size5;

public class Run {

    public static void main(String[] args) {

        try {
            Object lock = new Object();

            ThreadA a = new ThreadA(lock);
            a.start();

            Thread.sleep(50);

            ThreadB b = new ThreadB(lock);
            b.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
/*
wait begin 1438504148904
添加了1个元素!
添加了2个元素!
添加了3个元素!
添加了4个元素!
已发出通知！
添加了5个元素!
添加了6个元素!
添加了7个元素!
添加了8个元素!
添加了9个元素!
添加了10个元素!
wait end  1438504158950
 */