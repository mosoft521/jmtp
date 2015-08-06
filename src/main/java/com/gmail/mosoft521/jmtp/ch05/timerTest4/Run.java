package com.gmail.mosoft521.jmtp.ch05.timerTest4;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Timer timer = new Timer();
        System.out.println("当前时间：" + new Date().toLocaleString());
        timer.schedule(task, 3000, 5000);
    }

    static public class MyTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("运行了！时间为：" + new Date());
        }
    }
}
/*
当前时间：2015-8-6 22:41:04
运行了！时间为：Thu Aug 06 22:41:07 CST 2015
运行了！时间为：Thu Aug 06 22:41:12 CST 2015
...
 */