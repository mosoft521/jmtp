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
//ver1: private List list = new ArrayList();
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
和书上不一样啊！
//ver2: volatile private List list = new ArrayList();
添加了1个元素
添加了2个元素
添加了3个元素
添加了4个元素
添加了5个元素
==5了，线程b要退出了！
java.lang.InterruptedException
	at com.gmail.mosoft521.jmtp.ch03.project001TwoThreadTransData.ThreadB.run(ThreadB.java:18)
添加了6个元素
添加了7个元素
添加了8个元素
添加了9个元素
添加了10个元素
 */