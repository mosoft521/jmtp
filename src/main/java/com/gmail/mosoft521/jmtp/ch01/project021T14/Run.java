package com.gmail.mosoft521.jmtp.ch01.project021T14;

public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(200);
            thread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
/*
run begin
end!
在沉睡中被停止!进入catch! false
java.lang.InterruptedException: sleep interrupted
	at java.lang.Thread.sleep(Native Method)
	at com.gmail.mosoft521.jmtp.ch01.project021T14.MyThread.run(MyThread.java:9)
 */