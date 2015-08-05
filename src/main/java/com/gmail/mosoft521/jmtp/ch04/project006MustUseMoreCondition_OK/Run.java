package com.gmail.mosoft521.jmtp.ch04.project006MustUseMoreCondition_OK;

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

        service.signalAll_A();
    }
}
/*
begin awaitA时间为1438781667579 ThreadName=A
begin awaitB时间为1438781667579 ThreadName=B
  signalAll_A时间为1438781670580 ThreadName=main
  end awaitA时间为1438781670580 ThreadName=A
hold住?
 */