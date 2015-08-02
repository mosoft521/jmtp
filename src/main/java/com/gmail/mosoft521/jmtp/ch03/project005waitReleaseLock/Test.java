package com.gmail.mosoft521.jmtp.ch03.project005waitReleaseLock;

public class Test {

    public static void main(String[] args) {

        Object lock = new Object();

        ThreadA a = new ThreadA(lock);
        a.start();

        ThreadB b = new ThreadB(lock);
        b.start();
    }
}
/*
>>wait版
begin wait()
begin wait()
死锁了
>>sleep版
begin wait()
  end wait()
begin wait()
  end wait()
 */