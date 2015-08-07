package com.gmail.mosoft521.jmtp.ch07.project013formatError;

import java.text.SimpleDateFormat;

public class Test {

    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        String[] dateStringArray = new String[]{"2000-01-01", "2000-01-02",
                "2000-01-03", "2000-01-04", "2000-01-05", "2000-01-06",
                "2000-01-07", "2000-01-08", "2000-01-09", "2000-01-10"};

        MyThread[] threadArray = new MyThread[10];
        for (int i = 0; i < 10; i++) {
            threadArray[i] = new MyThread(sdf, dateStringArray[i]);
        }
        for (int i = 0; i < 10; i++) {
            threadArray[i].start();
        }
    }
}
/*
ThreadName=Thread-5报错了 日期字符串：2000-01-06 转换成的日期为：2000-01-02
ThreadName=Thread-7报错了 日期字符串：2000-01-08 转换成的日期为：2000-01-09
ThreadName=Thread-9报错了 日期字符串：2000-01-10 转换成的日期为：2000-01-04
 */