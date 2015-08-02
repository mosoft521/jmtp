package com.gmail.mosoft521.jmtp.ch02.project020T9;

import java.util.ArrayList;
import java.util.List;

public class MyOneList {

    private List list = new ArrayList();

    synchronized public void add(String data) {
        list.add(data);
    }

    synchronized public int getSize() {
        return list.size();
    }
}