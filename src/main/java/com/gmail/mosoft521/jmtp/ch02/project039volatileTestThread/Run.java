package com.gmail.mosoft521.jmtp.ch02.project039volatileTestThread;

public class Run {
    public static void main(String[] args) {
        MyThread[] mythreadArray = new MyThread[100];
        for (int i = 0; i < 50; i++) {
            mythreadArray[i] = new MyThread();
        }

        for (int i = 0; i < 50; i++) {
            mythreadArray[i].start();
        }
    }
}
/*
>>无synchronized
count=100
count=200
count=400
count=300
count=500
count=600
count=700
count=800
count=900
count=1000
count=1100
count=1200
count=1300
count=1400
count=1500
count=1600
count=1700
count=1800
count=1900
count=2000
count=2100
count=2200
count=2300
count=2400
count=2500
count=2600
count=2700
count=2800
count=2900
count=3000
count=3100
count=3200
count=3300
count=3400
count=3500
count=3600
count=3700
count=3800
count=3900
count=4000
count=4100
count=4200
count=4300
count=4400
count=4500
count=4600
count=4800
count=4800
count=5000
count=5000
>>有synchronized
count=100
count=200
count=300
count=400
count=500
count=600
count=700
count=800
count=900
count=1000
count=1100
count=1200
count=1300
count=1400
count=1500
count=1600
count=1700
count=1800
count=1900
count=2000
count=2100
count=2200
count=2300
count=2400
count=2500
count=2600
count=2700
count=2800
count=2900
count=3000
count=3100
count=3200
count=3300
count=3400
count=3500
count=3600
count=3700
count=3800
count=3900
count=4000
count=4100
count=4200
count=4300
count=4400
count=4500
count=4600
count=4700
count=4800
count=4900
count=5000
 */