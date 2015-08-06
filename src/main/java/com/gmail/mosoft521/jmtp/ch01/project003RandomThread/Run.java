package com.gmail.mosoft521.jmtp.ch01.project003RandomThread;

public class Run {
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.setName("myThread");
            myThread.start();
            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("main=" + Thread.currentThread().getName());
            }
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
//main=main
//run=myThread
//main=main
//main=main
//run=myThread
//main=main
//run=myThread
//run=myThread
//main=main
//run=myThread
//main=main
//run=myThread
//main=main
//run=myThread
//main=main
//run=myThread
//main=main
//main=main
//run=myThread
//run=myThread