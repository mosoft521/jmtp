package com.gmail.mosoft521.jmtp.ch03.project029joinMoreTest;

public class Run1 {
    public static void main(String[] args) {
        try {
            ThreadB b = new ThreadB();
            ThreadA a = new ThreadA(b);
            a.start();
            b.start();
            b.join(2000);
            System.out.println("                    main end " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
/*
begin A ThreadName=Thread-1  1438696721165
  end A ThreadName=Thread-1  1438696726166
begin B ThreadName=Thread-0  1438696726166
  end B ThreadName=Thread-0  1438696731167
                    main end 1438696731167
 */