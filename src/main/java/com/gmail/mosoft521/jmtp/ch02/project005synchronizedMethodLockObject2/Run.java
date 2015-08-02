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
begin methodA threadName=A
begin methodB threadName=B begin time=1438473302657
end
end endTime=1438473307658
第二次:
begin methodA threadName=A
begin methodB threadName=B begin time=1438473356931
end endTime=1438473361911
end
>>methodB有synchronized
第一次:
begin methodB threadName=B begin time=1438473382077
end
begin methodA threadName=A
end endTime=1438473392077
第二次:
begin methodA threadName=A
end endTime=1438473432236
begin methodB threadName=B begin time=1438473432236
end
 */