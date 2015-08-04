package com.gmail.mosoft521.jmtp.ch03.project020pipeInputOutput;

import java.io.PipedInputStream;

public class ThreadRead extends Thread {

    private ReadData read;
    private PipedInputStream input;

    public ThreadRead(ReadData read, PipedInputStream input) {
        super();
        this.read = read;
        this.input = input;
    }

    @Override
    public void run() {
        read.readMethod(input);
    }
}
