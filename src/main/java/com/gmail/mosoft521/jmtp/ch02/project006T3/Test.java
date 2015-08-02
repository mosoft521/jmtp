package com.gmail.mosoft521.jmtp.ch02.project006T3;

public class Test {

    public static void main(String[] args) {
        try {
            PublicVar publicVarRef = new PublicVar();
            ThreadA thread = new ThreadA(publicVarRef);
            thread.start();

            Thread.sleep(200);// 打印结果受此值大小影响

            publicVarRef.getValue();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
/*
>>getValue无synchronized:
第一次:
getValue method thread name=main username=B password=AA
setValue method thread name=Thread-0 username=B password=BB
第二次:
getValue method thread name=main username=B password=AA
setValue method thread name=Thread-0 username=B password=BB
>>getValue有synchronized:
第一次:
setValue method thread name=Thread-0 username=B password=BB
getValue method thread name=main username=B password=BB
第二次:
setValue method thread name=Thread-0 username=B password=BB
getValue method thread name=main username=B password=BB
 */