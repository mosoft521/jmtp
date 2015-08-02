package com.gmail.mosoft521.jmtp.ch02.project042synchronizedUpdateNewValue;

public class Run {

    public static void main(String[] args) {
        try {
            Service service = new Service();

            ThreadA a = new ThreadA(service);
            a.start();

            Thread.sleep(1000);

            ThreadB b = new ThreadB(service);
            b.start();

            System.out.println("已经发起停止的命令了！");
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
/*
>>无synchronized
已经发起停止的命令了！
暂停状态了
>>有synchronized
已经发起停止的命令了！
停下来了！
 */