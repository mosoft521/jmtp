package com.gmail.mosoft521.jmtp.ch03.project001TwoThreadTransData;

public class Test {

    public static void main(String[] args) {
        MyList service = new MyList();

        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();

        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
    }
}
/*
添加了1个元素
添加了2个元素
添加了3个元素
添加了4个元素
添加了5个元素
添加了6个元素
添加了7个元素
添加了8个元素
添加了9个元素
添加了10个元素
暂停状态了
 */