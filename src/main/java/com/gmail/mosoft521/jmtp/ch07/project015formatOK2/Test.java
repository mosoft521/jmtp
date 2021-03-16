package com.gmail.mosoft521.jmtp.ch07.project015formatOK2;

public class Test {

    public static void main(String[] args) {

        String[] dateStringArray = new String[]{"2000-01-01", "2000-01-02",
                "2000-01-03", "2000-01-04", "2000-01-05", "2000-01-06",
                "2000-01-07", "2000-01-08", "2000-01-09", "2000-01-10"};

        MyThread[] threadArray = new MyThread[10];
        for (int i = 0; i < 10; i++) {
            threadArray[i] = new MyThread(dateStringArray[i]);
        }
        for (int i = 0; i < 10; i++) {
            threadArray[i].start();
        }
    }
}
/*
解决方案：ThreadLocal
没有任何输出，即没有报错！
 */