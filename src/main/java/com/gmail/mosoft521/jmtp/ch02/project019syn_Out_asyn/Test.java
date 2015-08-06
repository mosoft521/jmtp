package com.gmail.mosoft521.jmtp.ch02.project019syn_Out_asyn;

public class Test {

    public static void main(String[] args) {
        MyList mylist = new MyList();

        MyThreadA a = new MyThreadA(mylist);
        a.setName("A");
        a.start();

        MyThreadB b = new MyThreadB(mylist);
        b.setName("B");
        b.start();
    }
}
/*
ThreadName=B执行了add方法！
ThreadName=B退出了add方法！
ThreadName=A执行了add方法！
ThreadName=A退出了add方法！
ThreadName=A执行了add方法！
ThreadName=A退出了add方法！
ThreadName=B执行了add方法！
...
 */