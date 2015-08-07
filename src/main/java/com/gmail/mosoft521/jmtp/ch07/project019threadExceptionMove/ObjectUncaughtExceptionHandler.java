package com.gmail.mosoft521.jmtp.ch07.project019threadExceptionMove;

import java.lang.Thread.UncaughtExceptionHandler;

public class ObjectUncaughtExceptionHandler implements UncaughtExceptionHandler {

	public void uncaughtException(Thread t, Throwable e) {
		System.out.println("对象的异常处理");
		e.printStackTrace();
	}
}