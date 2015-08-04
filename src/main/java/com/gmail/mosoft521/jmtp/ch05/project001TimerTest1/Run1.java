package com.gmail.mosoft521.jmtp.ch05.project001TimerTest1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Alvin on 2015/8/1.
 */
public class Run1 {
    private static Timer timer = new Timer();

    public static void main(String[] args) {
        try {
            MyTask myTask = new MyTask();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString = "205-08-01 00:00:00";
            Date dateRef = simpleDateFormat.parse(dateString);
            System.out.println("字符串时间: " + dateRef.toLocaleString() + " 当前时间: " + new Date().toLocaleString());
            timer.schedule(myTask, dateRef);
        } catch (ParseException pe) {
            pe.printStackTrace();
        }
    }

    static public class MyTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("运行了!时间为: " + new Date());
        }
    }
}