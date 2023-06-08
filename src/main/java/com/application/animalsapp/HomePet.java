package com.application.animalsapp;

import java.util.List;

public class HomePet extends  Animal{
    String Birth;
    List<String> Commands;

    public HomePet(String NAME, String BIRTH, List<String> COMMANDS) {
        super(NAME);
        Birth = BIRTH;
        Commands = COMMANDS;
    }

    public String getBirth() {
        return Birth;
    }

//    public String getCommands() {
//        return Commands;
//    }

    public  void showInfo() {
        String temp = "";
        for (int i = 0; i < Commands.size(); i++) {
            temp = temp + Commands.get(i) + ",";
        }
        System.out.println("Name: " + getName() + " | Birth: " + Birth + " | Commands: " + temp);
    }
}
