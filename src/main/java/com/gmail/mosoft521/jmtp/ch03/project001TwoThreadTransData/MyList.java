package com.gmail.mosoft521.jmtp.ch03.project001TwoThreadTransData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alvin on 2015/8/1.
 */
public class MyList {
    private List list = new ArrayList();

    public void add() {
        list.add("Alvin");
    }

    public int size() {
        return list.size();
    }
}
