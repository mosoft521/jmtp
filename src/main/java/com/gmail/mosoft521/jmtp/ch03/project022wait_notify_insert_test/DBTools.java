package com.gmail.mosoft521.jmtp.ch03.project022wait_notify_insert_test;

import java.util.concurrent.atomic.AtomicBoolean;

public class DBTools {

//    volatile private boolean prevIsA = false;
    volatile private AtomicBoolean prevIsA = new AtomicBoolean(false);

    synchronized public void backupA() {
        try {
//            while (prevIsA == true) {
            while (prevIsA.get()) {
                wait();
            }
            for (int i = 0; i < 5; i++) {
                System.out.println("★★★★★");
            }
//            prevIsA = true;
            prevIsA.set(true);
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void backupB() {
        try {
//            while (prevIsA == false) {
            while (!prevIsA.get()) {
                wait();
            }
            for (int i = 0; i < 5; i++) {
                System.out.println("☆☆☆☆☆");
            }
//            prevIsA = false;
            prevIsA.set(false);
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}