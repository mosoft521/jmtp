package com.gmail.mosoft521.jmtp.ch02.project016T8;

public class MyThread1 extends Thread {

    private Task task;

    public MyThread1(Task task) {
        super();
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        task.doLongTimeTask();
    }
}