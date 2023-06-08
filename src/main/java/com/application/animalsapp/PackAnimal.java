package com.application.animalsapp;

public class PackAnimal extends Animal{
    int Age;
    String Commands;

    public PackAnimal(String NAME, int AGE, String COMMANDS) {
        super(NAME);
        Age = AGE;
        Commands = COMMANDS;
    }

    public int getAge() {
        return Age;
    }

    public String getCommands() {
        return Commands;
    }
}
