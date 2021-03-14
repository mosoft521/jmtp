package com.gmail.mosoft521.jmtp.ch01.project011CurrentThreadExt;

public class Run {
//    public static void main(String[] args) {
//        CountOperate c = new CountOperate();
//        Thread t1 = new Thread(c);//包装了target
//        t1.setName("A");
//        t1.start();
//    }

    public static void main(String[] args) {
        Thread t1 = new CountOperate();//直接上
        t1.setName("A");
        t1.start();
    }
}
/*
CountOperate---begin
Thread.currentThread().getName()=main
this.getName()=Thread-0
CountOperate---end
run---begin
Thread.currentThread().getName()=A
this.getName()=Thread-0 //怎么才能A？不包裹嵌套之
run---end

//ver2:
CountOperate---begin
Thread.currentThread().getName()=main
this.getName()=Thread-0
CountOperate---end
run---begin
Thread.currentThread().getName()=A
this.getName()=A
run---end
 */