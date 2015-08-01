package com.gmail.mosoft521.jmtp.ch01.project023UseStopMethodThreadTest;

/**
 * Created by Alvin on 2015/8/1.
 */
public class MyThread extends Thread {
    private int i = 0;

    @Override
    public void run() {
        try {
            while (true) {
                i++;
                System.out.println("i=" + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
