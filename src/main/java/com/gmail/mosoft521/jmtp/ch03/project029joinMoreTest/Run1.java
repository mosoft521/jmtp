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
>>45%：
begin A ThreadName=Thread-1  1438696721165
  end A ThreadName=Thread-1  1438696726166
begin B ThreadName=Thread-0  1438696726166
  end B ThreadName=Thread-0  1438696731167
                    main end 1438696731167
>>45%：
begin A ThreadName=Thread-1  1615809216265
  end A ThreadName=Thread-1  1615809221267
                    main end 1615809221267
begin B ThreadName=Thread-0  1615809221267
  end B ThreadName=Thread-0  1615809226267

>>10%
begin A ThreadName=Thread-1  1615809548141
  end A ThreadName=Thread-1  1615809549142
begin B ThreadName=Thread-0  1615809549142
                    main end 1615809549142
  end B ThreadName=Thread-0  1615809550143
 */