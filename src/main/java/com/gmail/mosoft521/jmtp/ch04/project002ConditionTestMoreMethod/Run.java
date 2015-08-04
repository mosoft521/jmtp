package com.gmail.mosoft521.jmtp.ch04.project002ConditionTestMoreMethod;

public class Run {

    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();

        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadAA aa = new ThreadAA(service);
        aa.setName("AA");
        aa.start();

        Thread.sleep(100);

        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();

        ThreadBB bb = new ThreadBB(service);
        bb.setName("BB");
        bb.start();
    }
}
/*
methodA begin ThreadName=A time=1438698333464
methodA  end ThreadName=A time=1438698338474
methodA begin ThreadName=AA time=1438698338517
methodA  end ThreadName=AA time=1438698343517
methodB begin ThreadName=B time=1438698343517
methodB  end ThreadName=B time=1438698348518
methodB begin ThreadName=BB time=1438698348518
methodB  end ThreadName=BB time=1438698353518
 */