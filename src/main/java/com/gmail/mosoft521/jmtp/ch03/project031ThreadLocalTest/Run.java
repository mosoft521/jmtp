package com.gmail.mosoft521.jmtp.ch03.project031ThreadLocalTest;

public class Run {

    public static void main(String[] args) {

        try {
            ThreadA a = new ThreadA();
            ThreadB b = new ThreadB();
            a.start();
            b.start();

            for (int i = 0; i < 100; i++) {
                Tools.tl.set("Main" + (i + 1));
                System.out.println("Main get Value=" + Tools.tl.get());
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
/*
Main get Value=Main1
ThreadA get Value=ThreadA1
ThreadB get Value=ThreadB1
Main get Value=Main2
ThreadA get Value=ThreadA2
ThreadB get Value=ThreadB2
Main get Value=Main3
ThreadA get Value=ThreadA3
ThreadB get Value=ThreadB3
Main get Value=Main4
ThreadA get Value=ThreadA4
ThreadB get Value=ThreadB4
...
 */