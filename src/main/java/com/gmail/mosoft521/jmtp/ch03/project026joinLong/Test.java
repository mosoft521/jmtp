package com.gmail.mosoft521.jmtp.ch03.project026joinLong;

public class Test {

    public static void main(String[] args) {
        try {
            MyThread threadTest = new MyThread();
            threadTest.start();

//             threadTest.join(2000);// 只等2秒
            Thread.sleep(2000);

            System.out.println("  end timer=" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
/*
>>版本一
begin Timer=1438695954019
  end timer=1438695956018
>>版本二
begin Timer=1438695615697
  end timer=1438695617696
 */