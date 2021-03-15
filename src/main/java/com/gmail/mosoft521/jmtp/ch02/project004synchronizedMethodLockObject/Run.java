package com.gmail.mosoft521.jmtp.ch02.project004synchronizedMethodLockObject;

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
>>无synchronized
第一次:
ThreadA.run(): A
begin methodA threadName=A
ThreadB.run(): B
begin methodA threadName=B
MyObject.methodA() end
MyObject.methodA() end
第二次:
ThreadB.run(): B
ThreadA.run(): A
begin methodA threadName=B
begin methodA threadName=A
MyObject.methodA() end
MyObject.methodA() end
第三次:
ThreadB.run(): B
begin methodA threadName=B
ThreadA.run(): A
begin methodA threadName=A
MyObject.methodA() end
MyObject.methodA() end
>>有synchronized
第一次:
ThreadA.run(): A
ThreadB.run(): B
begin methodA threadName=A
MyObject.methodA() end
begin methodA threadName=B
MyObject.methodA() end
第二次:
ThreadA.run(): A
begin methodA threadName=A
ThreadB.run(): B
MyObject.methodA() end
begin methodA threadName=B
MyObject.methodA() end
第三次:
ThreadA.run(): A
ThreadB.run(): B
begin methodA threadName=A
MyObject.methodA() end
begin methodA threadName=B
MyObject.methodA() end
第四次：
ThreadA.run(): A
ThreadB.run(): B
begin methodA threadName=B
MyObject.methodA() end
begin methodA threadName=A
MyObject.methodA() end
 */