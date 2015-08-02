package com.gmail.mosoft521.jmtp.ch02.project014T7;

public class Run {

    public static void main(String[] args) {
        Task task = new Task();

        MyThread1 thread1 = new MyThread1(task);
        thread1.start();

        MyThread2 thread2 = new MyThread2(task);
        thread2.start();
    }
}
/*
第一次:
NOSYnchronized threadName=Thread-1 i=1
NOSYnchronized threadName=Thread-1 i=2
NOSYnchronized threadName=Thread-1 i=3
NOSYnchronized threadName=Thread-0 i=1
NOSYnchronized threadName=Thread-0 i=2
NOSYnchronized threadName=Thread-0 i=3
NOSYnchronized threadName=Thread-0 i=4
NOSYnchronized threadName=Thread-0 i=5
NOSYnchronized threadName=Thread-0 i=6
NOSYnchronized threadName=Thread-0 i=7
NOSYnchronized threadName=Thread-0 i=8
NOSYnchronized threadName=Thread-0 i=9
NOSYnchronized threadName=Thread-0 i=10

SYNChronized threadName=Thread-0 i=1
SYNChronized threadName=Thread-0 i=2
SYNChronized threadName=Thread-0 i=3
SYNChronized threadName=Thread-0 i=4
SYNChronized threadName=Thread-0 i=5
SYNChronized threadName=Thread-0 i=6
SYNChronized threadName=Thread-0 i=7
SYNChronized threadName=Thread-0 i=8
SYNChronized threadName=Thread-0 i=9
SYNChronized threadName=Thread-0 i=10
NOSYnchronized threadName=Thread-1 i=4
NOSYnchronized threadName=Thread-1 i=5
NOSYnchronized threadName=Thread-1 i=6
NOSYnchronized threadName=Thread-1 i=7
NOSYnchronized threadName=Thread-1 i=8
NOSYnchronized threadName=Thread-1 i=9
NOSYnchronized threadName=Thread-1 i=10

SYNChronized threadName=Thread-1 i=1
SYNChronized threadName=Thread-1 i=2
SYNChronized threadName=Thread-1 i=3
SYNChronized threadName=Thread-1 i=4
SYNChronized threadName=Thread-1 i=5
SYNChronized threadName=Thread-1 i=6
SYNChronized threadName=Thread-1 i=7
SYNChronized threadName=Thread-1 i=8
SYNChronized threadName=Thread-1 i=9
SYNChronized threadName=Thread-1 i=10
第二次:
NOSYnchronized threadName=Thread-0 i=1
NOSYnchronized threadName=Thread-0 i=2
NOSYnchronized threadName=Thread-0 i=3
NOSYnchronized threadName=Thread-0 i=4
NOSYnchronized threadName=Thread-0 i=5
NOSYnchronized threadName=Thread-0 i=6
NOSYnchronized threadName=Thread-0 i=7
NOSYnchronized threadName=Thread-0 i=8
NOSYnchronized threadName=Thread-0 i=9
NOSYnchronized threadName=Thread-0 i=10

SYNChronized threadName=Thread-0 i=1
SYNChronized threadName=Thread-0 i=2
SYNChronized threadName=Thread-0 i=3
SYNChronized threadName=Thread-0 i=4
SYNChronized threadName=Thread-0 i=5
SYNChronized threadName=Thread-0 i=6
SYNChronized threadName=Thread-0 i=7
SYNChronized threadName=Thread-0 i=8
SYNChronized threadName=Thread-0 i=9
SYNChronized threadName=Thread-0 i=10
NOSYnchronized threadName=Thread-1 i=1
NOSYnchronized threadName=Thread-1 i=2
NOSYnchronized threadName=Thread-1 i=3
NOSYnchronized threadName=Thread-1 i=4
NOSYnchronized threadName=Thread-1 i=5
NOSYnchronized threadName=Thread-1 i=6
NOSYnchronized threadName=Thread-1 i=7
NOSYnchronized threadName=Thread-1 i=8
NOSYnchronized threadName=Thread-1 i=9
NOSYnchronized threadName=Thread-1 i=10

SYNChronized threadName=Thread-1 i=1
SYNChronized threadName=Thread-1 i=2
SYNChronized threadName=Thread-1 i=3
SYNChronized threadName=Thread-1 i=4
SYNChronized threadName=Thread-1 i=5
SYNChronized threadName=Thread-1 i=6
SYNChronized threadName=Thread-1 i=7
SYNChronized threadName=Thread-1 i=8
SYNChronized threadName=Thread-1 i=9
SYNChronized threadName=Thread-1 i=10
 */