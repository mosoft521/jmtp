package com.gmail.mosoft521.jmtp.ch01.project008T4Threadsafe;

/**
 * Created by Alvin on 2015/8/1.
 */
public class BLogin extends Thread {
    @Override
    public void run() {
        LoginServlet.doPost("b", "bb");
    }
}
