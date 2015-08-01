package com.gmail.mosoft521.jmtp.ch02.project001T1;

/**
 * Created by Alvin on 2015/8/1.
 */
public class HasSelfPrivateNum {
    public void addI(String username) {
        try {
            int num = 0;
            if (username.equals("a")) {
                num = 100;
                System.out.println("a set over!");
                Thread.sleep(2000);
            } else {
                num = 200;
                System.out.println("b set over!");
                Thread.sleep(2000);
            }
            System.out.println(username + " num = " + num);
        } catch (InterruptedException ie) {
            //TODO:
            ie.printStackTrace();
        }
    }
}
