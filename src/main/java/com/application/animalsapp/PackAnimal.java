package com.application.animalsapp;

import java.util.List;

public class PackAnimal extends Animal{

    String Name;
    String Birth;
    List<String> Commands;

    public PackAnimal(String NAME, String BIRTH, List<String> COMMANDS) {
        Name = NAME;
        Birth = BIRTH;
        Commands = COMMANDS;
    }

    public String getAge() {
        return Birth;
    }

    public List<String> getCommands() {
        return Commands;
    }

    public  void showInfo() {
        System.out.println("Name: " + Name + " | Birth: " + Birth + " | Commands: " + Commands.toString());
    }

    public void addCommand(String newCommand) {
        Commands.add(newCommand);
    }
}
