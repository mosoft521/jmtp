package com.gmail.mosoft521.jmtp.ch01.project007T4;

/**
 * Created by Alvin on 2015/8/1.
 */
public class Run {
    public static void main(String[] args) {
        MyThread mythread = new MyThread();

        Thread a = new Thread(mythread, "A");
        Thread b = new Thread(mythread, "B");
        Thread c = new Thread(mythread, "C");
        Thread d = new Thread(mythread, "D");
        Thread e = new Thread(mythread, "E");
        Thread f = new Thread(mythread, "F");
        Thread g = new Thread(mythread, "G");
        Thread h = new Thread(mythread, "H");
        Thread i = new Thread(mythread, "I");
        Thread j = new Thread(mythread, "J");
        Thread k = new Thread(mythread, "K");
        Thread l = new Thread(mythread, "L");
        Thread m = new Thread(mythread, "M");
        Thread n = new Thread(mythread, "N");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
        f.start();
        g.start();
        h.start();
        i.start();
        j.start();
        k.start();
        l.start();
        m.start();
        n.start();
    }
}
//由 D 计算，count=13
//由 E 计算，count=12
//由 C 计算，count=11
//由 A 计算，count=10
//由 G 计算，count=9
//由 H 计算，count=8
//由 I 计算，count=7
//由 B 计算，count=6
//由 F 计算，count=5
//由 J 计算，count=4
//由 N 计算，count=3
//由 M 计算，count=2
//由 L 计算，count=1
//由 K 计算，count=0