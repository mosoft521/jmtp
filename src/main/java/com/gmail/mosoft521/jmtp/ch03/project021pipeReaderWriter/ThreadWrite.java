package com.gmail.mosoft521.jmtp.ch03.project021pipeReaderWriter;

import java.io.PipedWriter;

public class ThreadWrite extends Thread {

    private WriteData write;
    private PipedWriter out;

    public ThreadWrite(WriteData write, PipedWriter out) {
        super();
        this.write = write;
        this.out = out;
    }

    @Override
    public void run() {
        write.writeMethod(out);
    }
}