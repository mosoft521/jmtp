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
版本一:
begin wait() ThreadName=Thread-0
begin notify() ThreadName=Thread-1 time=1438504586613
  end notify() ThreadName=Thread-1 time=1438504591613
  end wait() ThreadName=Thread-0
begin notify() ThreadName=Thread-2 time=1438504591613
  end notify() ThreadName=Thread-2 time=1438504596613
版本二:
begin wait() ThreadName=Thread-0
begin notify() ThreadName=Thread-1 time=1438520877051
  end notify() ThreadName=Thread-1 time=1438520882052
  end wait() ThreadName=Thread-0
begin notify() ThreadName=Thread-2 time=1438520882052
  end notify() ThreadName=Thread-2 time=1438520887053
版本三:
begin notify() ThreadName=Thread-1 time=1438520937336
  end notify() ThreadName=Thread-1 time=1438520942336
begin notify() ThreadName=Thread-2 time=1438520942336
  end notify() ThreadName=Thread-2 time=1438520947336
begin wait() ThreadName=Thread-0
等待状态?
 */