package com.gmail.mosoft521.jmtp.ch07.project019threadExceptionMove;

public class Run1 {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        // 对象
        myThread.setUncaughtExceptionHandler(new ObjectUncaughtExceptionHandler());
        // 类
        MyThread.setDefaultUncaughtExceptionHandler(new StateUncaughtExceptionHandler());
        myThread.start();
    }
}
/*
//ver1:
对象的异常处理
java.lang.NumberFormatException: For input string: "a"
	at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
	at java.lang.Integer.parseInt(Integer.java:580)
	at java.lang.Integer.parseInt(Integer.java:615)
	at com.gmail.mosoft521.jmtp.ch07.project019threadExceptionMove.MyThread.run(MyThread.java:17)
//ver2:对象下注释掉
静态的异常处理
java.lang.NumberFormatException: For input string: "a"
	at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
	at java.lang.Integer.parseInt(Integer.java:580)
	at java.lang.Integer.parseInt(Integer.java:615)
	at com.gmail.mosoft521.jmtp.ch07.project019threadExceptionMove.MyThread.run(MyThread.java:17)
 */