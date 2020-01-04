package com.kodilla.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbManager {
    private Connection conn;
    private static DbManager dbManagerInstance;

    private DbManager() throws SQLException {
        Properties connectionProps = new Properties();
        connectionProps.put("user", "root");
        connectionProps.put("password", "66164912Ble!");
        conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/kodilla_course?serverTimezone=Europe/Warsaw" +
                        "&useSSL=false" + "&allowPublicKeyRetrieval=true",
                connectionProps);
    }

    public static DbManager getInstance() throws SQLException {
        if (dbManagerInstance == null) {
            dbManagerInstance = new DbManager();
        }
        return dbManagerInstance;
    }

    public Connection getConnection() {
        return conn;
    }
}
