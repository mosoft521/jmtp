package com.gmail.mosoft521.jmtp.ch06.singleton_9;

public class Run {

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.start();
        t2.start();
        t3.start();
    }
}
/*
调用了MyObject的构造
java.lang.ClassNotFoundException: com.microsoft.sqlserver.jdbc.SQLServerDriver
	at java.net.URLClassLoader.findClass(URLClassLoader.java:381)
	at java.lang.ClassLoader.loadClass(ClassLoader.java:424)
	at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:331)
	at java.lang.ClassLoader.loadClass(ClassLoader.java:357)
	at java.lang.Class.forName0(Native Method)
	at java.lang.Class.forName(Class.java:264)
	at com.gmail.mosoft521.jmtp.ch06.singleton_9.MyObject.<init>(MyObject.java:19)
	at com.gmail.mosoft521.jmtp.ch06.singleton_9.MyObject.<clinit>(MyObject.java:8)
	at com.gmail.mosoft521.jmtp.ch06.singleton_9.MyThread.run(MyThread.java:8)
Exception in thread "Thread-0" java.lang.NullPointerException
	at com.gmail.mosoft521.jmtp.ch06.singleton_9.MyThread.run(MyThread.java:9)
Exception in thread "Thread-2" java.lang.NullPointerException
	at com.gmail.mosoft521.jmtp.ch06.singleton_9.MyThread.run(MyThread.java:9)
Exception in thread "Thread-1" java.lang.NullPointerException
	at com.gmail.mosoft521.jmtp.ch06.singleton_9.MyThread.run(MyThread.java:9)
 */