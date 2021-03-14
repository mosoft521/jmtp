package com.gmail.mosoft521.jmtp.ch01.project033T19;

import static java.lang.Thread.MAX_PRIORITY;
import static java.lang.Thread.MIN_PRIORITY;

public class Run {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            MyThread1 thread1 = new MyThread1();
            thread1.setPriority(MAX_PRIORITY);
//            thread1.setPriority(MIN_PRIORITY);
            thread1.start();

            MyThread2 thread2 = new MyThread2();
            thread2.setPriority(MIN_PRIORITY);
//            thread2.setPriority(MAX_PRIORITY);
            thread2.start();
        }
    }
}
/*
>>版本一
第一次:
★★★★★thread 1 use time=452
★★★★★thread 1 use time=463
★★★★★thread 1 use time=473
☆☆☆☆☆thread 2 use time=662
★★★★★thread 1 use time=677
☆☆☆☆☆thread 2 use time=685
★★★★★thread 1 use time=754
☆☆☆☆☆thread 2 use time=788
☆☆☆☆☆thread 2 use time=801
☆☆☆☆☆thread 2 use time=810
第二次:
★★★★★thread 1 use time=310
★★★★★thread 1 use time=204
★★★★★thread 1 use time=209
★★★★★thread 1 use time=573
★★★★★thread 1 use time=634
☆☆☆☆☆thread 2 use time=703
☆☆☆☆☆thread 2 use time=456
☆☆☆☆☆thread 2 use time=453
☆☆☆☆☆thread 2 use time=314
☆☆☆☆☆thread 2 use time=538
第三次:
★★★★★thread 1 use time=379
★★★★★thread 1 use time=372
★★★★★thread 1 use time=427
☆☆☆☆☆thread 2 use time=422
☆☆☆☆☆thread 2 use time=527
★★★★★thread 1 use time=646
☆☆☆☆☆thread 2 use time=689
☆☆☆☆☆thread 2 use time=728
★★★★★thread 1 use time=670
☆☆☆☆☆thread 2 use time=650
>>版本二
第一次:
☆☆☆☆☆thread 2 use time=241
☆☆☆☆☆thread 2 use time=551
☆☆☆☆☆thread 2 use time=528
★★★★★thread 1 use time=669
☆☆☆☆☆thread 2 use time=425
☆☆☆☆☆thread 2 use time=501
★★★★★thread 1 use time=549
★★★★★thread 1 use time=857
★★★★★thread 1 use time=812
★★★★★thread 1 use time=581
第二次:
☆☆☆☆☆thread 2 use time=488
☆☆☆☆☆thread 2 use time=425
☆☆☆☆☆thread 2 use time=482
☆☆☆☆☆thread 2 use time=627
★★★★★thread 1 use time=627
☆☆☆☆☆thread 2 use time=619
★★★★★thread 1 use time=740
★★★★★thread 1 use time=776
★★★★★thread 1 use time=821
★★★★★thread 1 use time=759
第三次:
☆☆☆☆☆thread 2 use time=279
☆☆☆☆☆thread 2 use time=506
★★★★★thread 1 use time=423
☆☆☆☆☆thread 2 use time=697
☆☆☆☆☆thread 2 use time=629
☆☆☆☆☆thread 2 use time=666
★★★★★thread 1 use time=503
★★★★★thread 1 use time=821
★★★★★thread 1 use time=565
★★★★★thread 1 use time=434
 */