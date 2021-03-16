package com.gmail.mosoft521.jmtp.ch07.project019threadExceptionMove;

public class Run2 {

    public static void main(String[] args) {
        MyThreadGroup group = new MyThreadGroup("我的线程组");
        MyThread myThread = new MyThread(group, "我的线程");
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
//ver2: 对象下面注释掉：
静态的异常处理
线程组的异常处理
java.lang.NumberFormatException: For input string: "a"
	at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
	at java.lang.Integer.parseInt(Integer.java:580)
	at java.lang.Integer.parseInt(Integer.java:615)
	at com.gmail.mosoft521.jmtp.ch07.project019threadExceptionMove.MyThread.run(MyThread.java:17)
java.lang.NumberFormatException: For input string: "a"
	at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
	at java.lang.Integer.parseInt(Integer.java:580)
	at java.lang.Integer.parseInt(Integer.java:615)
	at com.gmail.mosoft521.jmtp.ch07.project019threadExceptionMove.MyThread.run(MyThread.java:17)
//ver3：全注释
Exception in thread "我的线程" java.lang.NumberFormatException: For input string: "a"
	at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
	at java.lang.Integer.parseInt(Integer.java:580)
	at java.lang.Integer.parseInt(Integer.java:615)
	at com.gmail.mosoft521.jmtp.ch07.project019threadExceptionMove.MyThread.run(MyThread.java:17)
java.lang.NumberFormatException: For input string: "a"
	at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
	at java.lang.Integer.parseInt(Integer.java:580)
	at java.lang.Integer.parseInt(Integer.java:615)
	at com.gmail.mosoft521.jmtp.ch07.project019threadExceptionMove.MyThread.run(MyThread.java:17)
线程组的异常处理
 */