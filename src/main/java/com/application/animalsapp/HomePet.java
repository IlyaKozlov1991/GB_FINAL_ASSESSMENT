package com.application.animalsapp;

import java.util.List;

public class HomePet extends  Animal{

    String Name;
    String Birth;
    List<String> Commands;

    public HomePet(String NAME, String BIRTH, List<String> COMMANDS) {
        Name = NAME;
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
        System.out.println("Name: " + Name + " | Birth: " + Birth + " | Commands: " + Commands.toString());
    }

    public void addCommand(String newCommand) {
        Commands.add(newCommand);
    }
}
