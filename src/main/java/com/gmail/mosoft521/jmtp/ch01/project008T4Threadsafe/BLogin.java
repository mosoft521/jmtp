package com.gmail.mosoft521.jmtp.ch01.project008T4Threadsafe;

public class BLogin extends Thread {
    @Override
    public void run() {
        LoginServlet.doPost("b", "bb");
    }
}