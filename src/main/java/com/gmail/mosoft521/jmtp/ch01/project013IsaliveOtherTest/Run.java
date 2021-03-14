package com.gmail.mosoft521.jmtp.ch01.project013IsaliveOtherTest;

public class Run {
//    public static void main(String[] args) {
//        CountOperate c = new CountOperate();
//        Thread t1 = new Thread(c);
//        System.out.println("main begin t1 isAlive=" + t1.isAlive());
//        t1.setName("A");
//        t1.start();
//        System.out.println("main end t1 isAlive=" + t1.isAlive());
//    }

    public static void main(String[] args) {
        Thread t1 = new CountOperate();
        System.out.println("main begin t1 isAlive=" + t1.isAlive());
        t1.setName("A");
        t1.start();
        System.out.println("main end t1 isAlive=" + t1.isAlive());
    }
}
/*
CountOperate---begin
Thread.currentThread().getName()=main
Thread.currentThread().isAlive()=true
this.getName()=Thread-0
this.isAlive()=false
CountOperate---end

main begin t1 isAlive=false
main end t1 isAlive=true

run---begin
Thread.currentThread().getName()=A
Thread.currentThread().isAlive()=true
this.getName()=Thread-0
this.isAlive()=false //Thread.currentThread()和This的区别
run---end

//ver2:
CountOperate---begin
Thread.currentThread().getName()=main
Thread.currentThread().isAlive()=true
this.getName()=Thread-0
this.isAlive()=false
CountOperate---end
main begin t1 isAlive=false
main end t1 isAlive=true
run---begin
Thread.currentThread().getName()=A
Thread.currentThread().isAlive()=true
this.getName()=A
this.isAlive()=true
run---end
 */