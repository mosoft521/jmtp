package com.gmail.mosoft521.jmtp.ch07.project015formatOK2;

import java.text.SimpleDateFormat;

public class DateTools {

    private static ThreadLocal<SimpleDateFormat> tl = new ThreadLocal<>();

    public static SimpleDateFormat getSimpleDateFormat(String datePattern) {
        SimpleDateFormat sdf;
        sdf = tl.get();
        if (null == sdf) {
            sdf = new SimpleDateFormat(datePattern);
            tl.set(sdf);
        }
        return sdf;
    }
}