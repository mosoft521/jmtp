package com.gmail.mosoft521.jmtp.ch02.project012synchronizedOneThreadIn;

public class Run {

    public static void main(String[] args) {
        ObjectService service = new ObjectService();

        ThreadA a = new ThreadA(service);
        a.setName("a");
        a.start();

        ThreadB b = new ThreadB(service);
        b.setName("b");
        b.start();
    }
}
/*
begin time=1438475688935
end    end=1438475690936
begin time=1438475690936
end    end=1438475692936
 */