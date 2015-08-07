package com.gmail.mosoft521.jmtp.ch05.timerTest2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run {
    public static void main(String[] args) {
        try {
            MyTask task = new MyTask();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString = "2014-10-12 09:12:00";
            Timer timer = new Timer();
            Date dateRef = sdf.parse(dateString);
            System.out.println("字符串时间：" + dateRef.toLocaleString() + " 当前时间：" + new Date().toLocaleString());
            timer.schedule(task, dateRef, 4000);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    static public class MyTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("运行了！时间为：" + new Date());
        }
    }
}
/*
字符串时间：2014-10-12 9:12:00 当前时间：2015-8-6 22:38:22
运行了！时间为：Thu Aug 06 22:38:22 CST 2015
运行了！时间为：Thu Aug 06 22:38:26 CST 2015
运行了！时间为：Thu Aug 06 22:38:30 CST 2015
..
 */