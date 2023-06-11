package com.application.animalsapp;

import java.nio.charset.StandardCharsets;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataBaseConnector {
    String URL;
    String USER;
    String PASSWORD;

    public DataBaseConnector(String URL, String USER, String PASSWORD) {
        this.URL = URL;
        this.USER = USER;
        this.PASSWORD = PASSWORD;
    }

    public void readDB() {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);){
            DriverManager.getDriver(URL);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from orders");

//            List<String> output = new ArrayList<>();
            while (resultSet.next()) {
//                output.add(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getInt(3));
                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getInt(3));

            }
//            for (int i = 0; i < output.size(); i++) {
//                System.out.println(output.get(i));
//            }
            System.out.println("\nTable \"orders\" has been read\n");
        } catch (SQLException e) {
            System.out.println("Fault: " + e.getMessage());
        }
        Counter counter = new Counter(0);
        counter.add();
        counter.getVal();
        System.out.println("Exit");
    }
}
