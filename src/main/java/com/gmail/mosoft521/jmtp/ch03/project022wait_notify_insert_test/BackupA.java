package com.gmail.mosoft521.jmtp.ch03.project022wait_notify_insert_test;

public class BackupA extends Thread {

    private DBTools dbtools;

    public BackupA(DBTools dbtools) {
        super();
        this.dbtools = dbtools;
    }

    @Override
    public void run() {
        dbtools.backupA();
    }
}