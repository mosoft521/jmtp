package com.gmail.mosoft521.jmtp.ch06.singleton_5;

public class Run {

    public static void main(String[] args) {
        //三线程版本：
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.start();
        t2.start();
        t3.start();

//        //100线程版本：
//        for (int i = 0; i < 100; i++) {
//            MyThread myThread = new MyThread();
//            myThread.start();//有缺陷啊，不是同步启动的。
//        }
    }
}
/*
1181171385
1181171385
1181171385
 */