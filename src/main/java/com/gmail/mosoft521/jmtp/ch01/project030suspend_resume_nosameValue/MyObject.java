package com.gmail.mosoft521.jmtp.ch01.project030suspend_resume_nosameValue;

/**
 * Created by Alvin on 2015/8/1.
 */
public class MyObject {

    private String username = "1";
    private String password = "11";

    public void setValue(String u, String p) {
        this.username = u;
        if (Thread.currentThread().getName().equals("a")) {
            System.out.println("暂停a线程！");
            Thread.currentThread().suspend();
        }
        this.password = p;
    }

    public void printUsernamePassword() {
        System.out.println(username + " " + password);
    }
}
