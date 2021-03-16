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
>>第一次：
ThreadName=Thread-5报错了 日期字符串：2000-01-06 转换成的日期为：2000-01-02
ThreadName=Thread-7报错了 日期字符串：2000-01-08 转换成的日期为：2000-01-09
ThreadName=Thread-9报错了 日期字符串：2000-01-10 转换成的日期为：2000-01-04
>>第二次：
ThreadName=Thread-2报错了 日期字符串：2000-01-03 转换成的日期为：2000-01-00
>>第三次：
ThreadName=Thread-2报错了 日期字符串：2000-01-03 转换成的日期为：2000-02-03
ThreadName=Thread-6报错了 日期字符串：2000-01-07 转换成的日期为：2019-03-08
ThreadName=Thread-7报错了 日期字符串：2000-01-08 转换成的日期为：7000-01-08
ThreadName=Thread-5报错了 日期字符串：2000-01-06 转换成的日期为：2000-01-08
Exception in thread "Thread-4" java.lang.NumberFormatException: For input string: ""
	at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
	at java.lang.Long.parseLong(Long.java:601)
	at java.lang.Long.parseLong(Long.java:631)
	at java.text.DigitList.getLong(DigitList.java:195)
	at java.text.DecimalFormat.parse(DecimalFormat.java:2084)
	at java.text.SimpleDateFormat.subParse(SimpleDateFormat.java:1869)
	at java.text.SimpleDateFormat.parse(SimpleDateFormat.java:1514)
	at java.text.DateFormat.parse(DateFormat.java:364)
	at com.gmail.mosoft521.jmtp.ch07.project013formatError.MyThread.run(MyThread.java:21)
ThreadName=Thread-1报错了 日期字符串：2000-01-02 转换成的日期为：0002-01-10
 */