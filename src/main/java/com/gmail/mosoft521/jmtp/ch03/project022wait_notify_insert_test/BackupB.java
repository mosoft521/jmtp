package com.gmail.mosoft521.jmtp.ch03.project022wait_notify_insert_test;

public class BackupB extends Thread {

    private DBTools dbtools;

    public BackupB(DBTools dbtools) {
        super();
        this.dbtools = dbtools;
    }

    @Override
    public void run() {
        dbtools.backupB();
    }
}