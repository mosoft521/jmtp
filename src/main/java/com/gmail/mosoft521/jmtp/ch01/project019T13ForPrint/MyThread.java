package com.gmail.mosoft521.jmtp.ch01.project019T13ForPrint;

/**
 * Created by Alvin on 2015/8/1.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 500000; i++) {
            if (this.interrupted()) {
                System.out.println("已经是停止状态了!我要退出了!");
                break;
            }
            System.out.println("i=" + (i + 1));
        }
        System.out.println("我被输出，如果此代码是for又继续运行，线程并未停止！");
    }
}
