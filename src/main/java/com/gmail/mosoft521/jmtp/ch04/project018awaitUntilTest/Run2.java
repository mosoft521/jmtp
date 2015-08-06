package com.gmail.mosoft521.jmtp.ch04.project018awaitUntilTest;

public class Run2 {

    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        MyThreadA myThreadA = new MyThreadA(service);
        myThreadA.start();

        Thread.sleep(2000);

        MyThreadB myThreadB = new MyThreadB(service);
        myThreadB.start();
    }
}
/*
wait begin timer=1438870483833
notify begin timer=1438870485821
notify   end timer=1438870485821
wait   end timer=1438870485821
 */