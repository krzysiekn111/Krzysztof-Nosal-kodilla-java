package com.kodilla.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Driver {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/kodilla_course"
                            + "?useUnicode=true" +
                            "&characterEncoding=UTF-" +
                            "8&allowPublicKeyRetrieval=true" +
                            "&useSSL=false",
                    "kodilla_user",
                    "kodilla_Pass123");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select u.firstname, u.lastname, count(*) as Task_number\n" +
                    "from users u join issues i on u.ID = i.USER_ID_ASSIGNEDTO\n" +
                    "group by i.USER_ID_ASSIGNEDTO\n" +
                    "ORDER BY U.LASTNAME, U.FIRSTNAME;");

            while (resultSet.next()) {
                System.out.println(resultSet.getString("LastNAME"));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

//                    "jdbc:mysql://localhost:3306/kodilla_course"
//                            + "?serverTimezone=Europe/Warsaw&amp" +
//                            "?&useSSL=False&allowPublicKeyRetrieval=true",
//                            "kodilla_user",
//                            "kodilla_Pass123");

//                ZADZIALALO!!!            + "?useUnicode=true&characterEncoding=UTF-8&allowPublicKeyRetrieval=true&useSSL=false",