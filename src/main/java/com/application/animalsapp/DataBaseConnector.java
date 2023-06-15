package com.application.animalsapp;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class DataBaseConnector {
    final String URL = "jdbc:mysql://127.0.0.1:3306/animals";
    final String USER = "root";
    final String PASSWORD = "mysql1234";

    public DataBaseConnector() {
    }

    public ObservableList<Animal> readHome() {
        ObservableList<Animal> list = FXCollections.observableArrayList();
        List<Animal> temp = new ArrayList<>();
        listOfHomePets(list, temp);
        return list;
    }

    public ObservableList<Animal> readPack() {
        ObservableList<Animal> list = FXCollections.observableArrayList();
        List<Animal> temp = new ArrayList<>();
        listOfPackAnimals(list, temp);
        return  list;
    }

    public void addAnimal(String table, String name, String birth, String commands) { executeAddAnimal(table, name, birth, commands); }

    public boolean addCommand(String table, String name, String newCommand) {
        return executeAddCommand(table, name,newCommand);
    }

    public boolean serverConnectionCheck() {
        return  requestToServer();
    }

    public int readCounter() {
        return executeReadCounter();
    }

    private boolean requestToServer() {
        boolean flag = false;
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            DriverManager.getDriver(URL);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from connection_test");
            while (resultSet.next()) {
                flag = resultSet.getBoolean(1);
            }
        } catch (SQLException e) {
            flag = false;
        }
        return flag;
    }

    private void listOfHomePets(ObservableList<Animal> list, List<Animal> temp) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            DriverManager.getDriver(URL);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from cats");
            temp.add(new Cat("КОШКИ", "", ""));
            while (resultSet.next()) {
                HomePet homePet = new HomePet(resultSet.getString(2), resultSet.getString(3), resultSet.getString(4));
                temp.add(homePet);
            }
            resultSet = statement.executeQuery("select * from dogs");
            temp.add(new Cat("СОБАКИ", "", ""));
            while (resultSet.next()) {
                HomePet homePet = new HomePet(resultSet.getString(2), resultSet.getString(3), resultSet.getString(4));
                temp.add(homePet);
            }
            resultSet = statement.executeQuery("select * from hamsters");
            temp.add(new Cat("ХОМЯКИ", "", ""));
            while (resultSet.next()) {
                HomePet homePet = new HomePet(resultSet.getString(2), resultSet.getString(3), resultSet.getString(4));
                temp.add(homePet);
            }
            for (Animal pet:
                    temp) {
                list.add(pet);
            }
        } catch (SQLException e) {
            System.out.println("Fault: " + e.getMessage());
        }
    }

    private void listOfPackAnimals(ObservableList<Animal> list, List<Animal> temp) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            DriverManager.getDriver(URL);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from horses");
            temp.add(new Cat("ЛОШАДИ", "", ""));
            while (resultSet.next()) {
                PackAnimal packAnimal = new PackAnimal(resultSet.getString(2), resultSet.getString(3), resultSet.getString(4));
                temp.add(packAnimal);
            }
            resultSet = statement.executeQuery("select * from donkeys");
            temp.add(new Cat("ОСЛЫ", "", ""));
            while (resultSet.next()) {
                PackAnimal packAnimal = new PackAnimal(resultSet.getString(2), resultSet.getString(3), resultSet.getString(4));
                temp.add(packAnimal);
            }
            resultSet = statement.executeQuery("select * from camels");
            temp.add(new Cat("ВЕРБЛЮДЫ", "", ""));
            while (resultSet.next()) {
                PackAnimal packAnimal = new PackAnimal(resultSet.getString(2), resultSet.getString(3), resultSet.getString(4));
                temp.add(packAnimal);
            }
            for (Animal animal:
                    temp) {
                list.add(animal);
            }
        } catch (SQLException e) {
            System.out.println("Fault: " + e.getMessage());
        }
    }

    private void executeAddAnimal(String table, String name, String birth, String commands) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            DriverManager.getDriver(URL);
            Statement statement = connection.createStatement();
            statement.executeUpdate("insert into " + table + " (name, birth, commands)" +
                    "\nvalues (\'" + name + "\', \'" + birth + "\', \'" + commands + "\')");
            setCounter();
        } catch (SQLException e) {
            System.out.println("Fault: " + e.getMessage());
        }
    }

    private boolean executeAddCommand(String table, String name, String newCommand) {
        boolean flag = false;
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            DriverManager.getDriver(URL);
            Statement statement = connection.createStatement();
            String respone = "";
            /*
            Ответ на первый запрос null/null/null -> поле в БД не найдено
             */
            ResultSet initSet = statement.executeQuery("select * from " + table +
                    "\nwhere name = \'" + name + "\'");
            while (initSet.next()) {
                respone = respone + initSet.getString(2) + initSet.getString(3) + initSet.getString(4);
            }
            if (!respone.equals("")) {
                respone = "";
                ResultSet resultSet = statement.executeQuery("select commands from " + table +
                        "\nwhere name = \'" + name + "\'");
                while (resultSet.next()) {
                    respone += resultSet.getString(1);
                }
                statement.executeUpdate("update " + table +
                        "\nset commands = " + "\'" + respone + ", " + newCommand + "\'" +
                        "\nwhere name = \'" + name + "\'");
                flag = true;
            }
        } catch (SQLException e) {
            System.out.println("Fault: " + e.getMessage());
        }
        return flag;
    }

    private void setCounter() {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            DriverManager.getDriver(URL);
            Statement statement = connection.createStatement();
            Counter counter = new Counter();
            ResultSet resultSet = statement.executeQuery("select counter from counter");
            while (resultSet.next()) {
                counter.setVal(resultSet.getInt(1));
            }
            counter.add();
            statement.executeUpdate("update counter" +
                    "\nset counter = " + counter.val);
        } catch (SQLException e) {
            System.out.println("Fault: " + e.getMessage());
        }
    }

    private int executeReadCounter() {
        Counter counter = null;
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            DriverManager.getDriver(URL);
            Statement statement = connection.createStatement();
            counter = new Counter();
            ResultSet resultSet = statement.executeQuery("select counter from counter");
            while (resultSet.next()) {
                counter.setVal(resultSet.getInt(1));
            }
        } catch (SQLException e) {
            System.out.println("Fault: " + e.getMessage());
        }
        return counter.val;
    }
}
