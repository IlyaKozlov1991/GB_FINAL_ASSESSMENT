package com.application.animalsapp;

public class HomePet extends  Animal{

    public HomePet(String NAME, String BIRTH, String COMMANDS) {
        Name = NAME;
        Birth = BIRTH;
        Commands = COMMANDS;
    }

    public String getName() { return Name; }

    public String getBirth() { return Birth; }

    public String getCommands() {
        return Commands;
    }

    public void setCommands(String commands) { Commands = commands; }

    public  void showInfo() {
        System.out.println("Name: " + Name + " | Birth: " + Birth + " | Commands: " + Commands.toString());
    }

}
