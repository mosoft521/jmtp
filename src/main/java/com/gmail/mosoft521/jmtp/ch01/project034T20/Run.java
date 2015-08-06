package com.gmail.mosoft521.jmtp.ch01.project034T20;

public class Run {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            MyThread1 thread1 = new MyThread1();
            thread1.setPriority(5);
            thread1.start();

            MyThread2 thread2 = new MyThread2();
            thread2.setPriority(6);
            thread2.start();
        }
    }
}
/*
>>1
☆☆☆☆☆thread 2 use time=3
★★★★★thread 1 use time=4
★★★★★thread 1 use time=3
★★★★★thread 1 use time=3
☆☆☆☆☆thread 2 use time=6
☆☆☆☆☆thread 2 use time=3
★★★★★thread 1 use time=5
★★★★★thread 1 use time=4
☆☆☆☆☆thread 2 use time=4
☆☆☆☆☆thread 2 use time=3
>>2
☆☆☆☆☆thread 2 use time=2
★★★★★thread 1 use time=2
☆☆☆☆☆thread 2 use time=9
★★★★★thread 1 use time=10
☆☆☆☆☆thread 2 use time=2
★★★★★thread 1 use time=2
★★★★★thread 1 use time=2
★★★★★thread 1 use time=3
☆☆☆☆☆thread 2 use time=5
☆☆☆☆☆thread 2 use time=4
>>3
★★★★★thread 1 use time=1
★★★★★thread 1 use time=2
★★★★★thread 1 use time=2
☆☆☆☆☆thread 2 use time=3
☆☆☆☆☆thread 2 use time=3
★★★★★thread 1 use time=4
☆☆☆☆☆thread 2 use time=1
☆☆☆☆☆thread 2 use time=2
★★★★★thread 1 use time=1
☆☆☆☆☆thread 2 use time=4
>>4
★★★★★thread 1 use time=2
★★★★★thread 1 use time=2
☆☆☆☆☆thread 2 use time=3
★★★★★thread 1 use time=3
☆☆☆☆☆thread 2 use time=2
☆☆☆☆☆thread 2 use time=4
★★★★★thread 1 use time=2
☆☆☆☆☆thread 2 use time=3
☆☆☆☆☆thread 2 use time=3
★★★★★thread 1 use time=5
>>5
★★★★★thread 1 use time=2
☆☆☆☆☆thread 2 use time=2
★★★★★thread 1 use time=2
★★★★★thread 1 use time=2
☆☆☆☆☆thread 2 use time=5
★★★★★thread 1 use time=3
★★★★★thread 1 use time=4
☆☆☆☆☆thread 2 use time=5
☆☆☆☆☆thread 2 use time=3
☆☆☆☆☆thread 2 use time=5
>>6
★★★★★thread 1 use time=2
★★★★★thread 1 use time=3
☆☆☆☆☆thread 2 use time=4
★★★★★thread 1 use time=3
☆☆☆☆☆thread 2 use time=3
☆☆☆☆☆thread 2 use time=5
★★★★★thread 1 use time=4
☆☆☆☆☆thread 2 use time=4
★★★★★thread 1 use time=5
☆☆☆☆☆thread 2 use time=5
 */