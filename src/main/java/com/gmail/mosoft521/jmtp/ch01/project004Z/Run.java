package com.gmail.mosoft521.jmtp.ch01.project004Z;

/**
 * Created by Alvin on 2015/8/1.
 */
public class Run {
    public static void main(String[] args) {
        MyThread t01 = new MyThread(1);
        MyThread t02 = new MyThread(2);
        MyThread t03 = new MyThread(3);
        MyThread t04 = new MyThread(4);
        MyThread t05 = new MyThread(5);
        MyThread t06 = new MyThread(6);
        MyThread t07 = new MyThread(7);
        MyThread t08 = new MyThread(8);
        MyThread t09 = new MyThread(9);
        MyThread t10 = new MyThread(10);
        MyThread t11 = new MyThread(11);
        t01.start();
        t02.start();
        t03.start();
        t04.start();
        t05.start();
        t06.start();
        t07.start();
        t08.start();
        t09.start();
        t10.start();
        t11.start();
    }
}
//3
//2
//7
//6
//10
//1
//5
//9
//11
//4
//8