package com.gmail.mosoft521.jmtp.ch07.project015formatOK2;

import java.text.ParseException;
import java.util.Date;

public class MyThread extends Thread {

    private String dateString;

    public MyThread(String dateString) {
        super();
        this.dateString = dateString;
    }

    @Override
    public void run() {
        try {
            Date dateRef = DateTools.getSimpleDateFormat("yyyy-MM-dd").parse(dateString);
            String newDateString = DateTools.getSimpleDateFormat("yyyy-MM-dd").format(dateRef);
            if (!newDateString.equals(dateString)) {
                System.out.println("ThreadName=" + this.getName() + "报错了 日期字符串：" + dateString + " 转换成的日期为：" + newDateString);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}