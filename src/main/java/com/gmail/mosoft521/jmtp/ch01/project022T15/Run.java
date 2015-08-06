package com.gmail.mosoft521.jmtp.ch01.project022T15;

public class Run {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        thread.interrupt();
        System.out.println("end!");
    }
}
/*
end!
i=1
i=2
...
i=100000
run begin
先停止，再遇到了sleep!进入catch!
java.lang.InterruptedException: sleep interrupted
	at java.lang.Thread.sleep(Native Method)
	at com.gmail.mosoft521.jmtp.ch01.project022T15.MyThread.run(MyThread.java:15)

 */