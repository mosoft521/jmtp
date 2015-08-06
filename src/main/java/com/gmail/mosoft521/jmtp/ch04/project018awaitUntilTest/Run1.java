package com.gmail.mosoft521.jmtp.ch04.project018awaitUntilTest;

public class Run1 {

    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        MyThreadA myThreadA = new MyThreadA(service);
        myThreadA.start();
    }
}
/*
wait begin timer=1438870454486
wait   end timer=1438870464470
 */