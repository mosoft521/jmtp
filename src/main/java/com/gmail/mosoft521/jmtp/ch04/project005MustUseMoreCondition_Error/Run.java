package com.gmail.mosoft521.jmtp.ch04.project005MustUseMoreCondition_Error;

public class Run {

    public static void main(String[] args) throws InterruptedException {

        MyService service = new MyService();

        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();

        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();

        Thread.sleep(3000);

        service.signalAll();
    }
}
/*
begin awaitB时间为1438781526921 ThreadName=B
begin awaitA时间为1438781526926 ThreadName=A
  signalAll时间为1438781529921 ThreadName=main
  end awaitB时间为1438781529921 ThreadName=B
  end awaitA时间为1438781529921 ThreadName=A
 */