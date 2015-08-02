package com.gmail.mosoft521.jmtp.ch03.project011waitOld;

public class Run {

    public static void main(String[] args) throws InterruptedException {

        String lock = new String("");

        Add add = new Add(lock);
        Subtract subtract = new Subtract(lock);

        ThreadSubtract subtract1Thread = new ThreadSubtract(subtract);
        subtract1Thread.setName("subtract1Thread");
        subtract1Thread.start();

        ThreadSubtract subtract2Thread = new ThreadSubtract(subtract);
        subtract2Thread.setName("subtract2Thread");
        subtract2Thread.start();

        Thread.sleep(1000);

        ThreadAdd addThread = new ThreadAdd(add);
        addThread.setName("addThread");
        addThread.start();
    }
}
/*
wait begin ThreadName=subtract1Thread
wait begin ThreadName=subtract2Thread
wait   end ThreadName=subtract2Thread
list size=0
wait   end ThreadName=subtract1Thread
wait begin ThreadName=subtract1Thread
暂停状态?
 */