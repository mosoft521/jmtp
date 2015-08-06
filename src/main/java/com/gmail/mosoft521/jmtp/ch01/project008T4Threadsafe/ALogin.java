package com.gmail.mosoft521.jmtp.ch01.project008T4Threadsafe;

public class ALogin extends Thread {
    @Override
    public void run() {
        LoginServlet.doPost("a", "aa");
    }
}