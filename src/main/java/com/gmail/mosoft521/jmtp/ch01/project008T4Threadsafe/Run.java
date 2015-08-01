package com.gmail.mosoft521.jmtp.ch01.project008T4Threadsafe;

/**
 * Created by Alvin on 2015/8/1.
 */
public class Run {

    public static void main(String[] args) {
        ALogin a = new ALogin();
        a.start();
        BLogin b = new BLogin();
        b.start();
    }

}
//username=a password=aa
//username=b password=bb