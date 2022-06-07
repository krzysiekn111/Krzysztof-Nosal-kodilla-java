package com.kodilla.jdbc;

import java.sql.*;
import java.util.Properties;

public enum DbManager {

    INSTANCE;

    private Connection conn;

    DbManager() {
        Properties connectionProps = new Properties();
        connectionProps.put("user", "kodilla_user");
        connectionProps.put("password", "kodilla_Pass123");
        try {
            conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/kodilla_course",
                    "kodilla_user",
                    "kodilla_Pass123");

        } catch (SQLException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static DbManager getInstance() {
        return INSTANCE;
    }

    public Connection getConnection() {
        return conn;
        }
    }


//                        "jdbc:mysql://localhost:3306/kodilla-course" +
//                                "?serverTimezone=Europe/Warsaw" +
//                                "&useSSL=False&allowPublicKeyRetrieval=true",
//                                connectionProps);

//                    "jdbc:mysql://localhost:3306/kodilla_course" +
//                            "?serverTimezone=Europe/Warsaw" +
//                            "&useSSL=False&allowPublicKeyRetrieval=true",
//                            "user" + "kodilla_user",
//                            "password" + "kodilla_Pass123");

//        connectionProps.put("user", "kodilla_user");
//                connectionProps.put("password", "kodilla_Pass123");
