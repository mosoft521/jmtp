package com.gmail.mosoft521.jmtp.ch03.project029joinMoreTest;

public class RunFirst {

    public static void main(String[] args) {
        ThreadB b = new ThreadB();
        ThreadA a = new ThreadA(b);
        a.start();
        b.start();
        System.out.println("   main end=" + System.currentTimeMillis());
    }
}
/*
   main end=1438696674391
begin A ThreadName=Thread-1  1438696674392
  end A ThreadName=Thread-1  1438696679393
begin B ThreadName=Thread-0  1438696679394
  end B ThreadName=Thread-0  1438696684394
 */