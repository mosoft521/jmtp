package com.gmail.mosoft521.jmtp.ch05.timerTest2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run2_1 {
    public static void main(String[] args) {
        try {
            MyTaskA taskA = new MyTaskA();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString = "2015-3-19 14:14:00";
            Timer timer = new Timer();
            Date dateRef = sdf.parse(dateString);
            System.out.println("字符串时间：" + dateRef.toLocaleString() + " 当前时间："
                    + new Date().toLocaleString());
            timer.schedule(taskA, dateRef, 4000);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    static public class MyTaskA extends TimerTask {
        @Override
        public void run() {
            try {
                System.out.println("A运行了！时间为：" + new Date());
                Thread.sleep(5000);
                System.out.println("A结束了！时间为：" + new Date());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
/*
字符串时间：2015-3-19 14:14:00 当前时间：2015-8-6 22:39:06
A运行了！时间为：Thu Aug 06 22:39:06 CST 2015
A结束了！时间为：Thu Aug 06 22:39:11 CST 2015
A运行了！时间为：Thu Aug 06 22:39:11 CST 2015
 */