package com.gmail.mosoft521.jmtp.ch02.project005synchronizedMethodLockObject2;

public class Run {

    public static void main(String[] args) {
        MyObject object = new MyObject();
        ThreadA a = new ThreadA(object);
        a.setName("A");
        ThreadB b = new ThreadB(object);
        b.setName("B");

        a.start();
        b.start();
    }
}
/*
>>methodB无synchronized
第一次:
ThreadB.run(): B
ThreadA.run(): A
begin methodB threadName=B begin time=1615683075819
begin methodA threadName=A
end methodB
end methodA endTime=1615683080819
第二次:
ThreadA.run(): A
ThreadB.run(): B
begin methodA threadName=A
begin methodB threadName=B begin time=1615683101471
end methodA endTime=1615683106471
end methodB
第三次：
ThreadB.run(): B
begin methodB threadName=B begin time=1615683126419
ThreadA.run(): A
begin methodA threadName=A
end methodB
end methodA endTime=1615683131419
>>methodB有synchronized
第一次:
ThreadA.run(): A
ThreadB.run(): B
begin methodA threadName=A
end methodA endTime=1615683235764
begin methodB threadName=B begin time=1615683235764
end methodB
第二次:
ThreadA.run(): A
ThreadB.run(): B
begin methodB threadName=B begin time=1615683263147
end methodB
begin methodA threadName=A
end methodA endTime=1615683273147
 */