package com.gmail.mosoft521.jmtp.ch01.project031T17;

/**
 * Created by Alvin on 2015/8/1.
 */
public class Run {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
/*
注释时:用时：20毫秒！
未注释时:用时：5526毫秒！
 */