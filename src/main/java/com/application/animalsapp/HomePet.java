package com.application.animalsapp;

public class HomePet extends  Animal{

//    String Name;
//    String Birth;
//    String Commands;

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

//    public void setName(String name) { Name = name; }
//
//    public void setBirth(String birth) { Birth = birth; }

    public void setCommands(String commands) { Commands = commands; }

    public  void showInfo() {
        System.out.println("Name: " + Name + " | Birth: " + Birth + " | Commands: " + Commands.toString());
    }

}
