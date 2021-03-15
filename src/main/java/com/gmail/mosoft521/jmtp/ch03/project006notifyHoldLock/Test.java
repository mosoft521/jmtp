package com.gmail.mosoft521.jmtp.ch03.project006notifyHoldLock;

public class Test {

    public static void main(String[] args) throws InterruptedException {

        Object lock = new Object();

        ThreadA a = new ThreadA(lock);
        a.start();

        NotifyThread notifyThread = new NotifyThread(lock);
        notifyThread.start();

        synNotifyMethodThread synNotifyMethodThread = new synNotifyMethodThread(lock);
        synNotifyMethodThread.start();
    }
}
/*
begin wait() ThreadName=Thread-0
begin notify() ThreadName=Thread-1 time=1615780901384
  end notify() ThreadName=Thread-1 time=1615780906384
  end wait() ThreadName=Thread-0
begin notify() ThreadName=Thread-2 time=1615780906384
  end notify() ThreadName=Thread-2 time=1615780911385
 */