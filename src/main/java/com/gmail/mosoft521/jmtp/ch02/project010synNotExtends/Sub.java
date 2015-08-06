package com.gmail.mosoft521.jmtp.ch02.project010synNotExtends;

public class Sub extends Main {

    @Override
    public void serviceMethod() {
//    synchronized public void serviceMethod() {
        try {
            System.out.println("int sub 下一步sleep begin threadName=" + Thread.currentThread().getName() + " time=" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("int sub 下一步sleep   end threadName=" + Thread.currentThread().getName() + " time=" + System.currentTimeMillis());
            super.serviceMethod();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}