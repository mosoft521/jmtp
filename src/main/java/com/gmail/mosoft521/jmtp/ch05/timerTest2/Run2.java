package com.gmail.mosoft521.jmtp.ch05.timerTest2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run2 {
    public static void main(String[] args) {
        try {
            MyTaskA taskA = new MyTaskA();
            MyTaskB taskB = new MyTaskB();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString = "2014-10-12 09:12:00";
            Timer timer = new Timer();
            Date dateRef = sdf.parse(dateString);
            System.out.println("字符串时间：" + dateRef.toLocaleString() + " 当前时间：" + new Date().toLocaleString());
            timer.schedule(taskA, dateRef, 4000);
            timer.schedule(taskB, dateRef, 4000);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    static public class MyTaskA extends TimerTask {
        @Override
        public void run() {
            System.out.println("A运行了！时间为：" + new Date());
            this.cancel();
        }
    }

    static public class MyTaskB extends TimerTask {
        @Override
        public void run() {
            System.out.println("B运行了！时间为：" + new Date());
        }
    }
}
/*
字符串时间：2014-10-12 9:12:00 当前时间：2015-8-6 22:38:47
A运行了！时间为：Thu Aug 06 22:38:47 CST 2015
B运行了！时间为：Thu Aug 06 22:38:47 CST 2015
B运行了！时间为：Thu Aug 06 22:38:51 CST 2015
...
 */