package com.gmail.mosoft521.jmtp.ch02.project017synBlockString;

public class Run {

    public static void main(String[] args) {
        Service service = new Service();

        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();

        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
    }
}
/*
>>String anyString = new String();在方法体外
第一次:
线程名称为：B在1438482565825进入同步块
线程名称为：B在1438482568829离开同步块
线程名称为：A在1438482568829进入同步块
线程名称为：A在1438482571829离开同步块
第二次:
线程名称为：A在1438482597224进入同步块
线程名称为：A在1438482600224离开同步块
线程名称为：B在1438482600224进入同步块
线程名称为：B在1438482603224离开同步块
>>String anyString = new String();在方法体内:此时相当于方法内变量,每次都New,锁的不是同一个对象
第一次:
线程名称为：B在1438482153043进入同步块
线程名称为：A在1438482153049进入同步块
线程名称为：B在1438482156045离开同步块
线程名称为：A在1438482156050离开同步块
第二次:
线程名称为：A在1438482230166进入同步块
线程名称为：B在1438482230167进入同步块
线程名称为：A在1438482233167离开同步块
线程名称为：B在1438482233167离开同步块
 */