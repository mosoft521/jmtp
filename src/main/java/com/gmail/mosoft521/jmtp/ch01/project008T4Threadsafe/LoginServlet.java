package com.gmail.mosoft521.jmtp.ch01.project008T4Threadsafe;

//本类模拟成一个Servlet组件
public class LoginServlet {

    private static String usernameRef;
    private static String passwordRef;

    public static void doPost(String username, String password) {
//    synchronized public static void doPost(String username, String password) {
        try {
            usernameRef = username;
            if (username.equals("a")) {
                Thread.sleep(5000);
            }
            passwordRef = password;

            System.out.println("username=" + usernameRef + " password=" + password);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}