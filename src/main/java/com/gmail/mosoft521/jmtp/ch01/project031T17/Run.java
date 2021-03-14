package com.gmail.mosoft521.jmtp.ch01.project031T17;

public class Run {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
/*
注释时:用时：20毫秒！
去掉注释时:用时：5526毫秒！
 */