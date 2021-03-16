package com.gmail.mosoft521.jmtp.ch07.project016threadCreateException;

public class Main3 {

    public static void main(String[] args) {
        //匿名内部类anonymous inner class:
//        MyThread
//                .setDefaultUncaughtExceptionHandler(new UncaughtExceptionHandler() {
//                    public void uncaughtException(Thread t, Throwable e) {
//                        System.out.println("线程:" + t.getName() + " 出现了异常：");
//                        e.printStackTrace();
//                    }
//                });

        //lambda:
        MyThread.setDefaultUncaughtExceptionHandler((t, e) -> {
            System.out.println("线程:" + t.getName() + " 出现了异常：");
            e.printStackTrace();
        });
        MyThread t1 = new MyThread();
        t1.setName("线程t1");
        t1.start();

        MyThread t2 = new MyThread();
        t2.setName("线程t2");
        t2.start();
    }
}
/*
>>第一次：
线程:线程t2 出现了异常：
线程:线程t1 出现了异常：
java.lang.NullPointerException
	at com.gmail.mosoft521.jmtp.ch07.project016threadCreateException.MyThread.run(MyThread.java:7)
java.lang.NullPointerException
	at com.gmail.mosoft521.jmtp.ch07.project016threadCreateException.MyThread.run(MyThread.java:7)
 >>第二次：
 线程:线程t1 出现了异常：
线程:线程t2 出现了异常：
java.lang.NullPointerException
	at com.gmail.mosoft521.jmtp.ch07.project016threadCreateException.MyThread.run(MyThread.java:7)
java.lang.NullPointerException
	at com.gmail.mosoft521.jmtp.ch07.project016threadCreateException.MyThread.run(MyThread.java:7)
 */