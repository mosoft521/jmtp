package com.gmail.mosoft521.jmtp.ch06.singleton_9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public enum MyObject {
    connectionFactory;

    private Connection connection;

    MyObject() {
        try {
            System.out.println("调用了MyObject的构造");
            String url = "jdbc:mysql://localhost:3306/test?useSSL=false";
            String username = "root";
            String password = "admin";
            String driverName = "com.mysql.jdbc.Driver";
            Class.forName(driverName);
            connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }
}