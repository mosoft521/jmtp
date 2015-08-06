package com.gmail.mosoft521.jmtp.ch05.timerTest5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run1 {

    private static Timer timer = new Timer();
    private static int runCount = 0;

    public static void main(String[] args) {
        try {
            MyTask1 task1 = new MyTask1();
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString1 = "2014-10-12 15:11:00";
            Date dateRef1 = sdf1.parse(dateString1);
            System.out.println("字符串1时间：" + dateRef1.toLocaleString() + " 当前时间："
                    + new Date().toLocaleString());
            timer.schedule(task1, dateRef1, 3000);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    static public class MyTask1 extends TimerTask {
        @Override
        public void run() {
            try {
                System.out.println("1 begin 运行了！时间为：" + new Date());
                Thread.sleep(1000);
                System.out.println("1   end 运行了！时间为：" + new Date());
                runCount++;
                if (runCount == 5) {
                    timer.cancel();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
/*
字符串1时间：2014-10-12 15:11:00 当前时间：2015-8-6 22:41:39
1 begin 运行了！时间为：Thu Aug 06 22:41:39 CST 2015
1   end 运行了！时间为：Thu Aug 06 22:41:40 CST 2015
1 begin 运行了！时间为：Thu Aug 06 22:41:42 CST 2015
1   end 运行了！时间为：Thu Aug 06 22:41:43 CST 2015
1 begin 运行了！时间为：Thu Aug 06 22:41:45 CST 2015
1   end 运行了！时间为：Thu Aug 06 22:41:46 CST 2015
 */