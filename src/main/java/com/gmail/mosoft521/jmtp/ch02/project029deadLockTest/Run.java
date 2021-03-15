package com.gmail.mosoft521.jmtp.ch02.project029deadLockTest;

public class Run {
    public static void main(String[] args) {
        try {
            DealThread t1 = new DealThread();
            t1.setFlag("a");

            Thread thread1 = new Thread(t1);
            thread1.start();

            Thread.sleep(100);

            t1.setFlag("b");
            Thread thread2 = new Thread(t1);
            thread2.start();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
/*
username = a
username = b
...死锁了...
$jps
2432 Jps
7012 Run
10008 RemoteMavenServer36
104
10536 Launcher
//当前进程名字Run的进程id是7012
$jstack 7012
2021-03-15 07:22:08
Full thread dump Java HotSpot(TM) 64-Bit Server VM (25.281-b09 mixed mode):

"DestroyJavaVM" #15 prio=5 os_prio=0 tid=0x000001fff012b800 nid=0x1890 waiting on condition [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"Thread-1" #14 prio=5 os_prio=0 tid=0x000001fffcf42800 nid=0x2bc8 waiting for monitor entry [0x000000c8b1cff000]
   java.lang.Thread.State: BLOCKED (on object monitor)
        at com.gmail.mosoft521.jmtp.ch02.project029deadLockTest.DealThread.run(DealThread.java:38)
        - waiting to lock <0x000000076b122998> (a java.lang.Object)
        - locked <0x000000076b1229a8> (a java.lang.Object)
        at java.lang.Thread.run(Thread.java:748)

"Thread-0" #13 prio=5 os_prio=0 tid=0x000001fffcf42000 nid=0x14e8 waiting for monitor entry [0x000000c8b1bfe000]
   java.lang.Thread.State: BLOCKED (on object monitor)
        at com.gmail.mosoft521.jmtp.ch02.project029deadLockTest.DealThread.run(DealThread.java:24)
        - waiting to lock <0x000000076b1229a8> (a java.lang.Object)
        - locked <0x000000076b122998> (a java.lang.Object)
        at java.lang.Thread.run(Thread.java:748)

"Service Thread" #12 daemon prio=9 os_prio=0 tid=0x000001fffcece800 nid=0xeb4 runnable [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"C1 CompilerThread2" #11 daemon prio=9 os_prio=2 tid=0x000001fffc44b000 nid=0x2878 waiting on condition [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"C2 CompilerThread1" #10 daemon prio=9 os_prio=2 tid=0x000001fffc449800 nid=0x1448 waiting on condition [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"C2 CompilerThread0" #9 daemon prio=9 os_prio=2 tid=0x000001fffc446800 nid=0x1d88 waiting on condition [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"JDWP Command Reader" #8 daemon prio=10 os_prio=0 tid=0x000001fffc3c8000 nid=0x1e8c runnable [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"JDWP Event Helper Thread" #7 daemon prio=10 os_prio=0 tid=0x000001fffc3c6800 nid=0x1b14 runnable [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"JDWP Transport Listener: dt_socket" #6 daemon prio=10 os_prio=0 tid=0x000001fffc3c0800 nid=0x2828 runnable [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"Attach Listener" #5 daemon prio=5 os_prio=2 tid=0x000001fffc356800 nid=0x175c waiting on condition [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"Signal Dispatcher" #4 daemon prio=9 os_prio=2 tid=0x000001fffc3b4000 nid=0x3c0 runnable [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"Finalizer" #3 daemon prio=8 os_prio=1 tid=0x000001fffbbed800 nid=0x720 in Object.wait() [0x000000c8b10fe000]
   java.lang.Thread.State: WAITING (on object monitor)
        at java.lang.Object.wait(Native Method)
        - waiting on <0x000000076ae08ee0> (a java.lang.ref.ReferenceQueue$Lock)
        at java.lang.ref.ReferenceQueue.remove(ReferenceQueue.java:144)
        - locked <0x000000076ae08ee0> (a java.lang.ref.ReferenceQueue$Lock)
        at java.lang.ref.ReferenceQueue.remove(ReferenceQueue.java:165)
        at java.lang.ref.Finalizer$FinalizerThread.run(Finalizer.java:216)

"Reference Handler" #2 daemon prio=10 os_prio=2 tid=0x000001fffc326800 nid=0x358 in Object.wait() [0x000000c8b0fff000]
   java.lang.Thread.State: WAITING (on object monitor)
        at java.lang.Object.wait(Native Method)
        - waiting on <0x000000076ae06c00> (a java.lang.ref.Reference$Lock)
        at java.lang.Object.wait(Object.java:502)
        at java.lang.ref.Reference.tryHandlePending(Reference.java:191)
        - locked <0x000000076ae06c00> (a java.lang.ref.Reference$Lock)
        at java.lang.ref.Reference$ReferenceHandler.run(Reference.java:153)

"VM Thread" os_prio=2 tid=0x000001fffc301800 nid=0xbc0 runnable

"GC task thread#0 (ParallelGC)" os_prio=0 tid=0x000001fff0140000 nid=0x2df8 runnable

"GC task thread#1 (ParallelGC)" os_prio=0 tid=0x000001fff0141800 nid=0x10e8 runnable

"GC task thread#2 (ParallelGC)" os_prio=0 tid=0x000001fff0142800 nid=0x1818 runnable

"GC task thread#3 (ParallelGC)" os_prio=0 tid=0x000001fff0144000 nid=0x1ffc runnable

"VM Periodic Task Thread" os_prio=2 tid=0x000001fffc45e000 nid=0x29a0 waiting on condition

JNI global references: 1487


Found one Java-level deadlock:
=============================
"Thread-1":
  waiting to lock monitor 0x000001fffc32c678 (object 0x000000076b122998, a java.lang.Object),
  which is held by "Thread-0"
"Thread-0":
  waiting to lock monitor 0x000001fffc3285d8 (object 0x000000076b1229a8, a java.lang.Object),
  which is held by "Thread-1"

Java stack information for the threads listed above:
===================================================
"Thread-1":
        at com.gmail.mosoft521.jmtp.ch02.project029deadLockTest.DealThread.run(DealThread.java:38)
        - waiting to lock <0x000000076b122998> (a java.lang.Object)
        - locked <0x000000076b1229a8> (a java.lang.Object)
        at java.lang.Thread.run(Thread.java:748)
"Thread-0":
        at com.gmail.mosoft521.jmtp.ch02.project029deadLockTest.DealThread.run(DealThread.java:24)
        - waiting to lock <0x000000076b1229a8> (a java.lang.Object)
        - locked <0x000000076b122998> (a java.lang.Object)
        at java.lang.Thread.run(Thread.java:748)

Found 1 deadlock.
 */