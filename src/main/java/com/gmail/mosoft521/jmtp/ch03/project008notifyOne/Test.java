package com.gmail.mosoft521.jmtp.ch03.project008notifyOne;

public class Test {

    public static void main(String[] args) throws InterruptedException {

        Object lock = new Object();

        ThreadA a = new ThreadA(lock);
        a.start();

        ThreadB b = new ThreadB(lock);
        b.start();

        ThreadC c = new ThreadC(lock);
        c.start();

        Thread.sleep(1000);

        NotifyThread notifyThread = new NotifyThread(lock);
        notifyThread.start();
    }
}
/*
一次Notify版本：
begin wait() ThreadName=Thread-1
begin wait() ThreadName=Thread-2
begin wait() ThreadName=Thread-0
  end wait() ThreadName=Thread-1
  阻塞了...
多次Notify版本：
>>第一次运行：
begin wait() ThreadName=Thread-1
begin wait() ThreadName=Thread-2
begin wait() ThreadName=Thread-0
  end wait() ThreadName=Thread-1
  end wait() ThreadName=Thread-0
  end wait() ThreadName=Thread-2

>>第2次运行
begin wait() ThreadName=Thread-0
begin wait() ThreadName=Thread-1
begin wait() ThreadName=Thread-2
  end wait() ThreadName=Thread-0
  end wait() ThreadName=Thread-2
  end wait() ThreadName=Thread-1
 */