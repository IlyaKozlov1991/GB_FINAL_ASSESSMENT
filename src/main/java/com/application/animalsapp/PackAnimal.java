package com.application.animalsapp;

public class PackAnimal extends Animal{
    String Birth;
    String Commands;

    public PackAnimal(String NAME, String BIRTH, String COMMANDS) {
        super(NAME);
        Birth = BIRTH;
        Commands = COMMANDS;
    }

    public String getAge() {
        return Birth;
    }

    public String getCommands() {
        return Commands;
    }

    public  void showInfo() {
        System.out.println("Name: " + getName() + " | Birth: " + Birth + " | Commands: " + Commands);
    }
}
