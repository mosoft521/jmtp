package com.gmail.mosoft521.jmtp.ch02.project041atomicIntergerNoSafe;

public class Run {

    public static void main(String[] args) {
        try {
            MyService service = new MyService();

            MyThread[] array = new MyThread[5];
            for (int i = 0; i < array.length; i++) {
                array[i] = new MyThread(service);
            }
            for (int i = 0; i < array.length; i++) {
                array[i].start();
            }
            Thread.sleep(1000);
            System.out.println(service.aiRef.get());
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
/*
>>无synchronized
第一次:
Thread-0加了100之后的值是:100
Thread-1加了100之后的值是:201
Thread-2加了100之后的值是:302
Thread-3加了100之后的值是:403
Thread-4加了100之后的值是:503
505
第二次:
Thread-0加了100之后的值是:100
Thread-1加了100之后的值是:201
Thread-4加了100之后的值是:302
Thread-2加了100之后的值是:403
Thread-3加了100之后的值是:504
505
>>有synchronized
Thread-3加了100之后的值是:100
Thread-2加了100之后的值是:201
Thread-1加了100之后的值是:302
Thread-0加了100之后的值是:403
Thread-4加了100之后的值是:504
505
 */