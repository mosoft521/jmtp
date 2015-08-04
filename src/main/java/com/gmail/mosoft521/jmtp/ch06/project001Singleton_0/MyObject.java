package com.gmail.mosoft521.jmtp.ch06.project001Singleton_0;

/**
 * Created by Alvin on 2015/8/1.
 */
public class MyObject {
    //立即加载方式 == 恶汉模式
    private static MyObject myObject = new MyObject();

    private MyObject() {
    }

    public static MyObject getInstance() {
        //此代码版本为立即加载
        //此版本代码的缺点是不能有其他实例变量
        //因为getInstance()没有同步
        //所以有可能出现非线程安全问题
        return myObject;
    }
}